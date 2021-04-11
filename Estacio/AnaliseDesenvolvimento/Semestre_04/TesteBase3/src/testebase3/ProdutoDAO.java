
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import testebase3.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author bruno
 */
public class ProdutoDAO implements Serializable {
 
    public ProdutoDAO() {
        emf = Persistence.createEntityManagerFactory("TesteBasePU");
    }

    private final EntityManagerFactory emf; 
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public void incluir(Produto produto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public void excluir(Integer codigo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Produto produto = em.find(Produto.class, codigo);
            em.remove(produto);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public List obterTodos() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Produto.class));
            Query q = em.createQuery(cq);
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    public List<Produto>obterNome(String nome){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("Select p from Produto p where p.nome like ?1");
            q.setParameter(1, "%"+nome+"%");
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}
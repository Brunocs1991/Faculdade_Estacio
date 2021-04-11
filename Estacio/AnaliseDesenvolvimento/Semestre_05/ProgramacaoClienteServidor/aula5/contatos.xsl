<?xml version="1.0" encoding="utf8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<html><body>
<table border="1" width="100%">
<tr><td>Nome</td><td>Telefones</td></tr>
<xsl:for-each select="contatos/contato">
<tr><td><xsl:value-of select="@nome"/></td>
<td><ul>
<xsl:for-each select="telefone">
<li><xsl:value-of select="."/></li>
</xsl:for-each>
</ul></td></tr>
</xsl:for-each>
</table>
</body></html>
</xsl:template>
</xsl:stylesheet>
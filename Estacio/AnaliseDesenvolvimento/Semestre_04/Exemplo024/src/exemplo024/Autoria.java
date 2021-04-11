/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo024;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author bruno
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Autoria {
    String autor();
    int ano();
    String empresa() default "UNESA";
}

package br.com.projeto.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public abstract @interface IdentificarCampoPesquisa {
	String descricaoCampo(); // descricao do campo para a tela
	String campoConsulta(); // campo do banco
	int principal() default 10000; // posi��o de ir� aparecer no combo
}

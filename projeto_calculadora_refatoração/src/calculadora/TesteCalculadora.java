package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe é responsável por realizar testes simples e diretos da classe
 * <strong>Calculadora</strong>, verificando o funcionamento correto das operações
 * matemáticas básicas como soma, subtração, multiplicação e divisão.</p>
 *
 * <p>Este arquivo faz parte do projeto utilizado para demonstrar:</p>
 *
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Técnicas de revisão dinâmica</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>A classe TesteCalculadora funciona como ponto de entrada para validar o
 * comportamento da classe Calculadora, garantindo que cada operação responda
 * conforme o esperado.</p>
 *
 * @author Diogo Ribeiro
 * @version 1.0
 */

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		 /**
         * Teste de soma.
         *
         * Entrada: 2 e 3  
         * Operação: "+"
         * Resultado esperado: 5
         */
		System.out.println(calc.calcular(2, 3, "+"));
		
		 /**
         * Teste de subtração.
         *
         * Entrada: 10 e 4  
         * Operação: "-"  
         * Resultado esperado: 6
         */
		System.out.println(calc.calcular(10, 4, "-"));
		
		/**
         * Teste de multiplicação.
         *
         * Entrada: 3 e 5  
         * Operação: "*"  
         * Resultado esperado: 15
         */
		System.out.println(calc.calcular(3, 5, "*"));
		
		 /**
         * Teste de divisão válida.
         *
         * Entrada: 8 e 2  
         * Operação: "/"  
         * Resultado esperado: 4
         */
		System.out.println(calc.calcular(8, 2, "/"));
		
		try {
			System.out.println(calc.calcular(8, 0, "/")); //exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

        /**
         * Teste de operador inválido.
         *
         * Entrada: 5 e 5  
         * Operação: "x"  
         * Resultado esperado:
         *  - Mensagem informando operação inválida
         *  - Resultado: 0
         */
		try {
			System.out.println(calc.calcular(5, 5, "x")); //exceção
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

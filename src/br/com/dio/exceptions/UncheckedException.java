package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Invalida, Informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0(Zero)! ");
            }
            finally {
                System.out.println("Chegou no Finally!");
            }
        } while (continueLooping);


        System.out.println("O código conginua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
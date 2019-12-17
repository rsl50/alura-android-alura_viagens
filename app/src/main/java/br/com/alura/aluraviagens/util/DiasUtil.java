package br.com.alura.aluraviagens.util;

import androidx.annotation.NonNull;

public class DiasUtil {

    public static final String SINGULAR = " dia";
    public static final String PLURAL = " dias";

    @NonNull
    public static String formataDiasEmTexto (int quantidadeDeDias) {
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + PLURAL;
        }
        return quantidadeDeDias + SINGULAR;
    }
}

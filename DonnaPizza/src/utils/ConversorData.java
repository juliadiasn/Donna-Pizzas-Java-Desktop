package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData {

    public static String converterDataParaMySql(String data) throws ParseException {
        // Criar um objeto SimpleDateFormat para analisar a data no formato "dd/MM/yyyy"
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");

        // Parse da data de entrada para um objeto Date
        Date dataObj = formatoEntrada.parse(data);

        // Criar um objeto SimpleDateFormat para formatar a data no formato "yyyy-MM-dd"
        SimpleDateFormat formatoSaida = new SimpleDateFormat("yyyy-MM-dd");

        // Formatando a data no formato "yyyy-MM-dd"
        String dataFormatada = formatoSaida.format(dataObj);

        return dataFormatada;
    }

    public static String converterDataParaJava(String data) throws ParseException {
        // Criar um objeto SimpleDateFormat para analisar a data no formato "yyyy-MM-dd"
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");

        // Parse da data de entrada para um objeto Date
        Date dataObj = formatoEntrada.parse(data);

        // Criar um objeto SimpleDateFormat para formatar a data no formato "dd/MM/yyyy"
        SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy");

        // Formatando a data no formato "dd/MM/yyyy"
        String dataFormatada = formatoSaida.format(dataObj);

        return dataFormatada;
    }

}

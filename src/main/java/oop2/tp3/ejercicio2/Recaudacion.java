package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {

    private LectorCsv lectorCsv;

    public Recaudacion(LectorCsv lectorCsv) {
        this.lectorCsv = lectorCsv;
    }

    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<String[]> data = this.lectorCsv.createList();

        if (options.containsKey("company_name")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < data.size(); i++) {
                if (data.get(i)[1].equals(options.get("company_name"))) {
                    results.add(data.get(i));
                }
            }
            data = results;
        }

        if (options.containsKey("city")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < data.size(); i++) {
                if (data.get(i)[4].equals(options.get("city"))) {
                    results.add(data.get(i));
                }
            }
            data = results;
        }

        if (options.containsKey("state")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < data.size(); i++) {
                if (data.get(i)[5].equals(options.get("state"))) {
                    results.add(data.get(i));
                }
            }
            data = results;
        }

        if (options.containsKey("round")) {
            List<String[]> results = new ArrayList<String[]>();

            for (int i = 0; i < data.size(); i++) {
                if (data.get(i)[9].equals(options.get("round"))) {
                    results.add(data.get(i));
                }
            }
            data = results;
        }

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (int i = 0; i < data.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", data.get(i)[0]);
            mapped.put("company_name", data.get(i)[1]);
            mapped.put("number_employees", data.get(i)[2]);
            mapped.put("category", data.get(i)[3]);
            mapped.put("city", data.get(i)[4]);
            mapped.put("state", data.get(i)[5]);
            mapped.put("funded_date", data.get(i)[6]);
            mapped.put("raised_amount", data.get(i)[7]);
            mapped.put("raised_currency", data.get(i)[8]);
            mapped.put("round", data.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }

}

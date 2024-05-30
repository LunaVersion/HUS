package hus.oopold.lab8.coutryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        /* TODO: write code to test program */
        System.out.println("Origin Data:");
        testOriginalData();
        System.out.println("\nSort Increasing By Population:");
        testSortIncreasingByPopulation();
        System.out.println("\nSort Decreasing By Population");
        testSortDecreasingByPopulation();
        System.out.println("\nSort Increasing By Area");
        testSortIncreasingByArea();
        System.out.println("\nSort Decreasing By Area");
        testSortDecreasingByArea();
        System.out.println("\nSort Increasing By Gdp");
        testSortIncreasingByGdp();
        System.out.println("\nSort Decreasing By Gdp");
        testSortDecreasingByGdp();
        System.out.println("\nFilter Africa Country");
        testFilterAfricaCountry();
        System.out.println("\nFilter Asia Country");
        testFilterAsiaCountry();
        System.out.println("\nFilter Europe Country");
        testFilterEuropeCountry();
        System.out.println("\nFilter North America Country");
        testFilterNorthAmericaCountry();
        System.out.println("\nFilter South America Country");
        testFilterSouthAmericaCountry();
        System.out.println("\nFilter Most Populous Countries");
        testFilterMostPopulousCountries();
        System.out.println("\nFilter Least Populous Countries");
        testFilterLeastPopulousCountries();
        System.out.println("\nFilter Largest Area Countries");
        testFilterLargestAreaCountries();
        System.out.println("\nFilter Smallest Area Countries");
        testFilterSmallestAreaCountries();
        System.out.println("\nFilter Highest Gdp Countries");
        testFilterHighestGdpCountries();
        System.out.println("\nFilter Lowest Gdp Countries");
        testFilterLowestGdpCountries();
    }

    public static void readListData() {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader("D:\\Java\\Luna\\src\\hus\\oop\\lab8\\coutryarraymanager\\countrymanager.csv"));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                String[] data = line.split(COMMA_DELIMITER);

                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 *
                 */
                String code = data[0];
                String name = data[1];
                int population = Integer.parseInt(data[2]);
                double area = parseDouble(data[3]);
                double gdp = parseDouble(data[4]);

                Country africaCountry = new AfricaCountry(code, name, population, area, gdp);
                countryManager.add(africaCountry,0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        readListData();
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codeString);
    }
}

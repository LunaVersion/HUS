package hus.oop.lab8.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++){
            int minIdx = i;
            for (int j = 0; j < newArray.length; j++){
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()){
                    minIdx = j;
                }
            }
            if (minIdx != i){
                Country tempCountry = newArray[i];
                newArray[i] = newArray[minIdx];
                newArray[minIdx] = tempCountry;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++){
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[j].getPopulation() > newArray[maxIdx].getPopulation()){
                    maxIdx = j;
                }
            }
            if (maxIdx != i){
                Country temp = newArray[i];
                newArray[i] = newArray[maxIdx];
                newArray[maxIdx] = temp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        boolean swapped = true;
        int lastUnsorted = newArray.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < lastUnsorted; i++) {
                if (newArray[i].getArea() > newArray[i + 1].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    swapped = true;
                }
            }
            lastUnsorted--;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        boolean swapped = true;
        int lastUnsorted = newArray.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < lastUnsorted; i++) {
                if (newArray[i].getArea() < newArray[i + 1].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    swapped = true;
                }
            }
            lastUnsorted--;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country country = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > country.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = country;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++){
            Country country = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < country.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = country;
        }
        return newArray;
    }

//    public AfricaCountry[] filterAfricaCountry() {
//        ArrayList<AfricaCountry> africaCountries = new ArrayList<AfricaCountry>();
//        for (Country country : this.countries){
//            if (country instanceof AfricaCountry){
//                africaCountries.add((AfricaCountry) country);
//            }
//        }
//        return africaCountries.toArray(new AfricaCountry[0]);
//    }
//
//    public AsiaCountry[] filterAsiaCountry() {
//        ArrayList<AsiaCountry> asiaCountries = new ArrayList<AsiaCountry>();
//        for (Country country : this.countries){
//            if (country instanceof AsiaCountry){
//                asiaCountries.add((AsiaCountry) country);
//            }
//        }
//        return asiaCountries.toArray(new AsiaCountry[0]);
//    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> europeCountries = new ArrayList<EuropeCountry>();
        for (Country country : this.countries){
            if (country instanceof EuropeCountry){
                europeCountries.add((EuropeCountry) country);
            }
        }
        return europeCountries.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> northAmericaCountries = new ArrayList<NorthAmericaCountry>();
        for (Country country : this.countries){
            if (country instanceof NorthAmericaCountry){
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        return northAmericaCountries.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> oceaniaCountries = new ArrayList<OceaniaCountry>();
        for (Country country : this.countries){
            if (country instanceof OceaniaCountry){
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        return oceaniaCountries.toArray(new OceaniaCountry[0]);
    }

//    public SouthAmericaCountry[] filterSouthAmericaCountry() {
//        ArrayList<SouthAmericaCountry> southAmericaCountries = new ArrayList<SouthAmericaCountry>();
//        for (Country country : this.countries){
//            if (country instanceof SouthAmericaCountry){
//                southAmericaCountries.add((SouthAmericaCountry) country);
//            }
//        }
//        return southAmericaCountries.toArray(new SouthAmericaCountry[0]);
//    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingArea();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] sortedCountries = sortByDecreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] sortedCountries = sortByIncreasingGdp();
        Country[] result = new Country[howMany];
        System.arraycopy(sortedCountries, 0, result, 0, howMany);
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}

package lab06.countrymanager;

import java.util.ArrayList;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
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
        Country[] newArray = new Country[this.countries.length + this.increment];
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
            this.countries[i] = this.countries[i - 1];
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
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()) {
                    minIdx = j;
                }
            }
            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIdx].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    //Option 1: return notNull array, use EndsWith
    public AfricaCountry[] filterAfricaCountry() {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        ArrayList<AfricaCountry> listAfricaCountries = new ArrayList<AfricaCountry>();
        for (int i = 0; i < listCountries.length; i++) {
            if (listCountries[i].getClass().getName().endsWith("AfricaCountry")) {
                listAfricaCountries.add((AfricaCountry) listCountries[i]);
            }
        }

        AfricaCountry[] arrayAfricaCountries = new AfricaCountry[listAfricaCountries.size()];
        for (int i = 0; i < listAfricaCountries.size(); i++)
            arrayAfricaCountries[i] = listAfricaCountries.get(i);
        return arrayAfricaCountries;
    }

    //Option 2: return have-Null array; print only notNull; use EndsWith
    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] arrayAsiaCountries = new AsiaCountry[this.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null && countries[i].getClass().getName().endsWith("AsiaCountry")) {
                arrayAsiaCountries[i] = (AsiaCountry) countries[i];
            }
        }
        return arrayAsiaCountries;
    }

    //option 3 : return have-Null array; print only notNull; use instanceof
    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] arrayEuropeCountries = new EuropeCountry[this.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                arrayEuropeCountries[i] = (EuropeCountry) countries[i];
            }
        }
        return arrayEuropeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] arrayNorthAmericaCountries = new NorthAmericaCountry[this.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null && countries[i].getClass().getName().endsWith("NorthAmericaCountry")) {
                arrayNorthAmericaCountries[i] = (NorthAmericaCountry) countries[i];
            }
        }
        return arrayNorthAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] arrayOceaniaCountries = new OceaniaCountry[this.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                arrayOceaniaCountries[i] = (OceaniaCountry) countries[i];
            }
        }
        return arrayOceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] arraySouthAmericaCountries = new SouthAmericaCountry[this.length];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                arraySouthAmericaCountries[i] = (SouthAmericaCountry) countries[i];
            }
        }
        return arraySouthAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (listCountries[i].getPopulation() < listCountries[j].getPopulation()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }
        Country[] mostPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = listCountries[i];
        }
        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (listCountries[i].getPopulation() > listCountries[j].getPopulation()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }
        Country[] lessPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            lessPopulous[i] = listCountries[i];
        }
        return lessPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (countries[i].getArea() < listCountries[j].getArea()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }
        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = listCountries[i];
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (listCountries[i].getArea() > listCountries[j].getArea()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }
        Country[] smallArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallArea[i] = listCountries[i];
        }
        return smallArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (listCountries[i].getGdp() < listCountries[j].getGdp()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }

        Country[] highGDP = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highGDP[i] = listCountries[i];
        }
        return highGDP;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] listCountries = new Country[this.length];
        System.arraycopy(this.countries, 0, listCountries, 0, this.length);

        for (int i = 0; i < listCountries.length - 1; i++) {
            for (int j = i + 1; j < listCountries.length; j++) {
                if (listCountries[i].getGdp() > listCountries[j].getGdp()) {
                    Country temp = listCountries[i];
                    listCountries[i] = listCountries[j];
                    listCountries[j] = temp;
                }
            }
        }
        Country[] lowGDP = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            lowGDP[i] = listCountries[i];
        }
        return lowGDP;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
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

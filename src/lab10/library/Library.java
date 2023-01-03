package lab10.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] r) {
        this.rents = r;
    }

    public Rent getLongestRent() {
//        ArrayList<Long> minus= new ArrayList<>();
//        for(int i = 0; i < rents.length; i++) {
//            minus.add(rents[i].getEnd().getTime()- rents[i].getBegin().getTime());
//        }
//        Long longestTime = Collections.max(minus);
//
//        for(int i = 0; i < rents.length; i++) {
//            if(rents[i].getEnd().getTime()- rents[i].getBegin().getTime() == longestTime) {
//                return rents[i];
//            }
//        }
//        return null;
        int index = 0;
        Long maxRent = rents[0].getEnd().getTime() - rents[0].getBegin().getTime();
        for (int i = 0; i < rents.length; i++) {
            if (rents[i].getEnd().getTime() - rents[i].getBegin().getTime() > maxRent) {
                index = i;
            }
        }
        return rents[index];
    }
}

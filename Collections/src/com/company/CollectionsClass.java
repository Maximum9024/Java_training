package com.company;

import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {


        List<String> list= new ArrayList<>();
        list.add("Max");
        list.add("Silva");
        list.add("Karabelo");
        list.add("Simon");
        list.add("Lars");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
enum Currency{
    USD,
    EUR,
    ZAR,
    GBP;
}

class Money implements Comparable<Money> {

    private Currency currency;
    private double value;

    public  Money(Currency currency,double value ){
        this.currency = currency;
        this.value= value;

    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public String toString(){
        return "{ Currency "+currency+", value "+value+" }";
    }

     @Override
    public int compareTo(Money other) {
        if (this.getValue()>other.getValue()){
            return  -1;
        } else if(this.getValue()<other.getValue()){
            return 1;
        } else {
            return 0;
        }

    }

    public boolean equals(Object param){
        if(param==null)
            return false;

        if(!(param instanceof Money))
            return false;

        if(this==param)
            return true;

            return true;

    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, (value)*100);
    }
}
class bigMain{
    public static void main(String[] args) {
        ArrayList<Money> MoneyObj= new ArrayList<Money>();
        MoneyObj.add(new Money(Currency.USD,10));
        MoneyObj.add(new Money(Currency.ZAR,34));
        MoneyObj.add(new Money(Currency.EUR,45));
        MoneyObj.add(new Money(Currency.GBP,78));
        MoneyObj.add(new Money(Currency.USD,23));
        MoneyObj.add(new Money(Currency.EUR,22));
        MoneyObj.add(new Money(Currency.USD,10));
        MoneyObj.add(new Money(Currency.ZAR,47));
        MoneyObj.add(new Money(Currency.GBP,100));
        MoneyObj.add(new Money(Currency.USD,37));

    //    Collections.sort(MoneyObj,Comparator.comparing(Money::getValue));
          Collections.sort(MoneyObj);
         //   MoneyObj.forEach(System.out::println);


            System.out.println(MoneyObj);

    }

}
 class CompareMain{
     public static void main(String[] args) {
         Money money1= new Money(Currency.USD,10);
         Money money2=new Money(Currency.USD,10);
         bigMain bM= new bigMain();
         Boolean b= money1.equals(money2);
         System.out.println(b);
     }

 }
 class EquivalanceTest1 {
    public static void main(String[] args) {

        String a = "a";

        boolean result = a.equals(a);

        System.out.println("Result = " + result);
    }
}
class EquivalanceTest2 {
    public static void main(String[] args) {

        String a = new String("a");
        String b = new String("a");

        boolean result1 = a.equals(b);
        boolean result2 = b.equals(a);

        System.out.println("Result1 = "+result1);
        System.out.println("Result2 = "+result2);
    }
}
class EquivalanceTest5 {
    public static void main(String[] args) {

        String a = new String("a");

        boolean result = a.equals(null);

        System.out.println("Result1 = "+result);

    }
}
class Whatever{
    public static void main(String[] args) {
        String s1= new String("Whatever");
        String s2 =new String("whatever");
        Boolean results= s1.equals(s2);
        Boolean hashResults=s1.hashCode()==s2.hashCode();
        System.out.println(hashResults);
    }
}
 class GenericsEg1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("1");
        strings.add("3");
        strings.add("3");
        System.out.println("strings = "+strings);
    }
}
class Banana{
    @Override
    public String toString() {
        return "banana";
    }
}
class Ball{
    @Override
    public String toString() {
        return "ball";
    }
}

class GenClass{
    public static void main(String[] args) {
        List<Banana> bananas= new ArrayList<Banana>();
        bananas.add(new Banana());
        bananas.add(new Banana());
        bananas.add(new Banana());
        bananas.add(new Banana());

        Iterator it=bananas.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}


class GenClass2{
    public static void main(String[] args) {
        HashMap<Ball,Banana> BallBan= new HashMap<Ball, Banana>();

         BallBan.put(new Ball(), new Banana());
        BallBan.put(new Ball(), new Banana());
        BallBan.put(new Ball(), new Banana());
        BallBan.put(new Ball(), new Banana());
        BallBan.put(new Ball(), new Banana());

      Iterator iterator= BallBan.values().iterator();
           Iterator iterator1= BallBan.keySet().iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next()+" "+ iterator1.next());
           }

    }
}
class GenericsOnSteroids1 {
    public static void main(String[] args) {
        List amounts = new ArrayList();

        amounts.add(new Long(1));
        amounts.add(new Long(2));
        amounts.add(new Long(3));
        amounts.add(new Long(4));


        for(int i = 0; i < amounts.size();i++){

            Long amount = (Long) amounts.get(1);
            System.out.println("Position ["+i+"] amount ["+amount+"]");
        }
    }
}
class usdMoney{
    public static void main(String[] args) {
        List<Money> money=new ArrayList<Money>();
        money.add(new Money(Currency.USD,10));
        money.add(new Money(Currency.USD,10));
        money.add(new Money(Currency.USD,10));
        money.add(new Money(Currency.USD,10));
        money.add(new Money(Currency.USD,10));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.GBP,5));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
        money.add(new Money(Currency.ZAR,1));
           Iterator it= money.iterator();
           while (it.hasNext()){
               System.out.println(it.next());
           }



    }
}


class NestedListEg1 {
    public static void main(String[] args) {

        List<List<Money>> outerList = new ArrayList<List<Money>>();

        List<Money> innerList = new ArrayList<Money>();

        innerList.add(new Money(Currency.USD, 100));
        innerList.add(new Money(Currency.ZAR,12));
        innerList.add(new Money(Currency.USD,24));
         innerList.add(new Money(Currency.GBP,9));
         innerList.add(new Money(Currency.GBP,2));
         innerList.add(new Money(Currency.ZAR,34));
        outerList.add(innerList);


        System.out.println("outerList = "+outerList);
    }
}
 class MapsEg1 {
    public static void main(String[] args) {

        Map<String,List< Money>> shareMap = new HashMap<String,List<Money>>();
         List<Money>innerList=new ArrayList<Money>();

          for (int i=0;i<50;i++){
              innerList.add(new Money(Currency.USD,1));
          }
          for (int i=0;i<25;i++){
              innerList.add(new Money(Currency.USD,10));
          }
          for(int i=0;i<75;i++){
           innerList.add(new Money(Currency.USD,20));
          }
          for(int i=0;i<50;i++){
              innerList.add(new Money(Currency.USD,50));
          }
          for (int i=0;i<500;i++){
              innerList.add(new Money(Currency.USD,100));
          }
          shareMap.put("Sly",innerList);
        shareMap.put("Slicko",innerList);
        shareMap.put("No3",innerList);
        shareMap.put("John",innerList);


        System.out.println("shareMap = "+shareMap);
    }
}
interface Safe<T extends Money>{
    int lockln(T target);
    T getFromSafe(int key);

}
class  MoneySafeImpl<T extends Money>{
    int lockln(T target){

          list.add(target);
          return 0;
    }
    T getFromSafe(int key){

        return list.get(key);
    }
    private ArrayList<T> list=new ArrayList<T>();

}
class banana extends Money{

    public banana(Currency currency, double value) {
        super(currency, value);
    }

    @Override
    public String toString() {
        return "Currency "+getCurrency()+", Value "+getValue();
    }
}
class GenericMain{
    public static void main(String[] args) {
        banana ban1= new banana(Currency.ZAR,2);
        banana ban2= new banana(Currency.ZAR,2);
        banana ban3= new banana(Currency.ZAR,2);
        banana ban4= new banana(Currency.ZAR,2);
        banana ban5= new banana(Currency.ZAR,2);
        MoneySafeImpl<banana>  safeimpleGen= new MoneySafeImpl<banana>();
        safeimpleGen.lockln(ban1);
        safeimpleGen.lockln(ban2);
        safeimpleGen.lockln(ban3);
        safeimpleGen.lockln(ban4);
        safeimpleGen.lockln(ban5);

           for (int i=0;i<5;i++)
        System.out.println(safeimpleGen.getFromSafe(i));

    }
}
class ExSafeImpl1 extends MoneySafeImpl<Money>{

}
class ExSafeImpl2<E> extends MoneySafeImpl{

}
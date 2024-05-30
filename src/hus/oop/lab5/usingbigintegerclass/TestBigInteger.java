package hus.oop.lab5.usingbigintegerclass;
import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger integer1 = new BigInteger("111111111111111111111111111111111111");
        BigInteger integer2 = new BigInteger("222222222222222222222222222222222222");
        System.out.println(integer1.add(integer2));
    }
}

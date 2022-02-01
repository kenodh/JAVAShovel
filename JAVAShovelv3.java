package tk.threedollerjs;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.json.XML;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import tk.Js;

import static java.util.Locale.getDefault;
import static java.util.Locale.getISOCountries;

public class JAVAShovelv3 {
    Js my = new Js();
    public <T> void showl(T str) {
        System.out.println(str);
    }
    public <T> void show(T str) {
        System.out.print(str);
    }

    public <T> String input(T str) {
        Scanner myObj = new Scanner(System.in);  // Create A Scanner object
        System.out.println(str);
        return myObj.nextLine();
    }

    public double stod(String str) {
        return Double.parseDouble(str);
    }
    public int avarageintarr(int[] a) {
        int i,total;
        int n = 5;
        total = 0;
        for(i=0; i<n; i++) {
            total += a[i];
        }
        return total;
    }

    public int minimum(int first, int second){
        if(first < second){return 1;}
        if(first > second){return 2;}
        return 0;
    }

    public int maximum(int f, int s){
        if(f > s){return 1;}
        if(f < s){return 2;}
        return 0;
    }

    public int avarageint(int num1, int num2) {
        // take two numbers
        // declare sum variable
        // and initialize with 0
        int sum = 0;
        // declare average variable
        int avg = 0;
        // calculate the sum value
        sum = num1 + num2;
        // calculate the average value
        avg = sum/2;
        return avg;
    }

    public double avaragedoub(double num1, double num2) {
        // take two numbers
        // declare sum variable
        // and initialize with 0
        double sum = 0.0;
        // declare average variable
        double avg = 0.0;
        // calculate the sum value
        sum = num1 + num2;
        // calculate the average value
        avg = sum/2;
        return avg;
    }

    public double avaragestr(String num1, String num2){
        double a = stod(num1);
        double b = stod(num2);
        double sum = a + b;
        double avg = sum/2;
        return avg;
    }

    public int avaragestr2(String num1, String num2){
        int a = stoi(num1);
        int b = stoi(num2);
        int sum = a + b;
        int avg = sum/2;
        return avg;
    }

    public double dmax(String str) {
        return Double.parseDouble(str);
    }

    public String fromtointstr(int from, int to, String str) throws IOException {
        return str.substring(15, 20);
    }

    public String fromtocharstr(char from, char to, String cont) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(int i = 0; i<cont.length();i++){
            char ch = cont.charAt(i);
            if(ch == from){
                found = true;
                if(ch == to){
                    sb.append(to);
                    return sb.toString();
                }
            }
            if(found && ch != to){
                sb.append(ch);
            }
        }
        return "";
    }

    public String fromtostrstr(String from, String to, String cont) throws IOException {
        int ch = cont.indexOf(from);
        int chb = cont.indexOf(to);
        return cont.substring(ch, chb);
    }


    public String fromtointfile(int from, int to, String file) throws IOException {
        String a = filetostrp(file);
        return a.substring(15, 20);
    }

    public String sbtostr(int loop, char chr) throws IOException {
        return String.valueOf(chr).repeat(Math.max(0, loop));
    }

    public String isaprimenumber(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            return "no";
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    return "no";
                }
            }
            if(flag==0)  { return "yes"; }
        }//end of else
        return "";
    }

    public String isacountry(String country){
        Map<String, String> countries = new HashMap<>();
        for (String iso : Locale.getISOCountries()) {
            Locale l = new Locale("", iso);
            countries.put(l.getDisplayCountry(), iso);
        }
        return countries.get(country);
    }

    public String getmycountry() throws NullPointerException{
        Locale loc = new Locale("en");
        return loc.getDisplayCountry(getDefault());
    }

    public <T> String isastring(T var){
        return var.getClass().getSimpleName();
    }

    public int trianglenum(int what){
        int a = 0;
        if(what != 0){
            for(int i = 0;i<what;i++){
                a += a + 1;
            }
            return a;
        }
        return 0;
    }

    public int squarenum(int what){
        if(what != 0){
            return what*what;
        }
        return 0;
    }

    public int evennum(int what){
        // if what is equals to 5, returns 10
        return what*2;
    }

    public int oddnum(int what){
        // if what is equals to 5, returns 9
        return what*2-1;
    }

    public int compoundnum(int what){
        // compound number = has one or more factors(eg: 15, has 3 factors. they are 1, 15, 3 and 5(15 / 1 = 15 no remain. 15 / 15 = 1 no remain. 15 / 5 = 3 no remain. 15 / 3 = 5 no remain.)). eg: 4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30
        // if what is equals to 1, will return 4. if what is equals to 2, will return 6.....
        return what*2-1;
    }

    public String filetostrp(String file) throws IOException {
        Path fileName = Path.of(file);
        return Files.readString(fileName);
    }
    
    public String fromtocharfile(char from, char to, String file) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        String cont = filetostrp(file);
        for(int i = 0; i<cont.length();i++){
            char ch = cont.charAt(i);
            if(ch == from){
                found = true;
                if(ch == to){
                    sb.append(to);
                    return sb.toString();
                }
            }
            if(found && ch != to){
                sb.append(ch);
            }
        }
        return "";
    }
    public int stoi(String s) {
        return Integer.parseInt(s);
    }

    public String fromtostrfile1(String from, String to, String file) throws IOException {
        String cont = filetostrp(file);
        int one = cont.indexOf(from);
        int two = cont.indexOf(to, one);
        return cont.substring(one, two);
    }

    public int findintext(String str, String findstr){
        int a = 0;
        int b = 0;
        while(true){
            a = str.indexOf(findstr, a);
            if(a < 0){break;}
            b++;
            a += findstr.length();
        }
        return b;
    }

    public int findmatchesinfile(String str, String file) throws IOException {
        int a = 0;
        int b = 0;
        while(true){
            String c = filetostrp(file);
            if(c.equals("")) return -1;
            a = str.indexOf(c, a);
            if(a < 0) break;
            b++;
            a += c.length();
        }
        return b;
    }
    public int min(int a, int b) {
        return Math.min(a, b);
    }

}
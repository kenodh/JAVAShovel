import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


//abcdefghijklmnopqrstuvwxyz 0123456789 (){}[]
//ABCDEFGHIJKLMNOPQRSTUVWXYZ +-*/= .,;:!? #&$%@|^
public class Main extends JPanel{
    protected JButton b1;
  static <T> void print(T str) {
    System.out.println(str);
  }

  static <T> String input(T str) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println(str);

    String userName = myObj.nextLine();  // Read user input
    return userName;
  }

  static String getlocation(String ip) throws IOException {
    String gip = "http://api.geoiplookup.net/?query=" + ip;
    final OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
            .url(gip)
            .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }

  static void ppiramidup(int base, String obj) {
    /*for(int i; i<base; i++){
      System.out.println(obj);
    }*/
    if(base % 2 == 0){
      base++;
    }
    int spaces = base / 2;
    int asterix = 1;
    while (spaces >= 0) {
      for (int i = 0; i < spaces; i++) {
        System.out.print(' ');
      }
      for (int i = 0; i < asterix; i++) {
        System.out.print(obj);
      }
      System.out.println();
      spaces--;
      asterix+=2;
    }
  }


  static String LCase(String str){
    String out = str.toLowerCase();
    return out;
  }

  static void ppiramiddown(int base, String obj){
    if(base % 2 == 0){
      base++;
    }
    //base=5
    int spaces = 0;
    int asterix = base;
    while (spaces <= base / 2) {
      for (int i = 0; i < spaces; i++) {
        System.out.print(' ');
      }
      for (int i = 0; i < asterix; i++) {
        System.out.print(obj);
      }
      System.out.println();
      spaces++;
      asterix-=2;
    }
  }

  static void trianglemirrorrightcorner(int base, String obj){
    //base=5
    int i = 0;
    while(i <= base) {
      for (int j = i; j < base; j++) {
        System.out.print(obj);
      }
      System.out.println();
      i++;
    }
  }

  static void trianglerightcorner(int base, String obj){
    //base=5
    int i = base;
    while(i <= base) {
      for (int j = i; j < base; j++) {
        System.out.print(obj);
      }
      System.out.println();
      i--;
    }
  }



  static void funcloop(String funcname, int loop){
    for (int j = 0; j < loop; j++) {
      //funcname();
    }
  }

  static String UCase(String str){
    String out = str.toUpperCase();
    return out;
  }

  /*static String isvowelinstr(String str){
      int index = str.indexOf('a');
      if(index != -1){
        return "yes";
      }else{
          index = str.indexOf('e');
          if(index != -1){
              return "yes";
          }else{
              index = str.indexOf('i');
              if(index != -1){
                  return "yes";
              }else{
                  index = str.indexOf('o');
                  if(index != -1){
                      return "yes";
                  }else{
                      index = str.indexOf('u');
                      if(index != -1){
                          return "yes";
                      }else{
                          return "no";
                      }
                  }
              }
          }
      }
  }*/

  static String isvowelinstr(String str){
      for(int i=0;i<str.length();i++){
          char c = str.charAt(i);
          switch (c) {
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                  return "yes";
          }
      }
      return "no";
  }

  private static void createAndShowGUIbasic(String title, String massage) {
    //Create and set up the window.
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Add the ubiquitous "Hello World" label.
    JLabel label = new JLabel(massage);
    frame.getContentPane().add(label);

    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }
  static String isabird(String name) {
    switch (name) {
      case "parrot":
        return "yes";
        
      case "crow":
        return "yes";
        
      case "owl":
        return "yes";
        
      case "peacock":
        return "yes";
        
      case "dove":
        return "yes";
        
      case "sparrow":
        return "yes";
        
      case "goose":
        return "yes";
        
      case "stork":
        return "yes";
        
      case "pigeon":
        return "yes";
        
      case "turkey":
        return "yes";
        
      case "flamingo":
        return "yes";
        
      case "woodpeaker":
        return "yes";
        
      case "robin":
        return "yes";
        
      case "seagull":
        return "yes";
        
      case "ostrich":
        return "yes";
        
      case "raven":
        return "yes";
        
      case "eagle":
        return "yes";
        
      case "bald eagle":
        return "yes";
        
      case "hawk":
        return "yes";
        
      default:
        return "no";
    }
  }
  static String isafruit(String name) {
    switch (name) {
      case "apple":
        return "yes";
        
      case "pinapple":
        return "yes";
        
      case "cherry":
        return "yes";
        
      case "banana":
        return "yes";
        
      case "black berries":
        return "yes";
        
      case "blue berries":
        return "yes";
        
      case "straw berries":
        return "yes";
        
      case "raspberries":
        return "yes";
        
      case "avocados":
        return "yes";
        
      case "black current":
        return "yes";
        
      case "bread fruit":
        return "yes";
        
      case "date fruit":
        return "yes";
        
      case "coconut":
        return "yes";
        
      case "cranberries":
        return "yes";
        
      case "custard-apple":
        return "yes";
        
      case "elder berries":
        return "yes";
        
      case "goose berries":
        return "yes"; 
        
      case "grapefruit":
        return "yes";
        
      case "grapes":
        return "yes";
        
      default:
        return "no";
    }
  }

    static String isaservice(String name) {
        switch (name) {
            case "airtable":
                return "yes";

            case "amazon alexa":
                return "yes";

            case "cherry":
                return "yes";

            case "banana":
                return "yes";

            case "black berries":
                return "yes";

            case "blue berries":
                return "yes";

            case "straw berries":
                return "yes";

            case "raspberries":
                return "yes";

            case "avocados":
                return "yes";

            case "black current":
                return "yes";

            case "bread fruit":
                return "yes";

            case "date fruit":
                return "yes";

            case "coconut":
                return "yes";

            case "cranberries":
                return "yes";

            case "custard-apple":
                return "yes";

            case "elder berries":
                return "yes";

            case "goose berries":
                return "yes";

            case "grapefruit":
                return "yes";

            case "grapes":
                return "yes";

            default:
                return "no";
        }
    }

    static char convertatol(int value) {
        char a = (char)value;
        return a;
    }

  static boolean checkPlural(String str) {
    int  n=str.length();
    if(str.charAt(n-1)=='s')
    {
        return true;
    }
    return false;
  }

    protected static ImageIcon createImageIcon(String path, String ifnull) {
        if (path != null) {
            return new ImageIcon(path);
        } else {
            System.err.println(ifnull);
            return null;
        }
    }

  void guibutton(String text, String icon, String vtposition, String htposition, int newmonicif, String actioncommand, String ifimagenull){
      ImageIcon aButtonIcon = createImageIcon(icon, ifimagenull);
      b1 = new JButton(text, aButtonIcon);
      if(vtposition == "center"){
          b1.setVerticalTextPosition(AbstractButton.CENTER);
      }
      if(vtposition == "top"){
          b1.setVerticalTextPosition(AbstractButton.TOP);
      }
      if(vtposition == "bottom"){
          b1.setVerticalTextPosition(AbstractButton.BOTTOM);
      }

      if(htposition == "left"){
          b1.setVerticalTextPosition(AbstractButton.LEFT);
      }
      if(htposition == "center"){
          b1.setVerticalTextPosition(AbstractButton.CENTER);
      }
      if(htposition == "right"){
          b1.setVerticalTextPosition(AbstractButton.RIGHT);
      }
      if(htposition == "leading"){
          b1.setVerticalTextPosition(AbstractButton.LEADING);
      }
      if(htposition == "trailing"){
          b1.setVerticalTextPosition(AbstractButton.TRAILING);
      }
      //aka LEFT, for left-to-right locales
      b1.setMnemonic(newmonicif);
      b1.setActionCommand(actioncommand);
  }

    static String reversestring(String s)
    {
        String rev="";
        for(int j=s.length();j>0;--j){
            rev=rev+(s.charAt(j-1));
        }
        return rev;
    }

  static double calculate(double numa, String operand, double numb) {
    double result = 0.0;
    if(operand == "+"){
        result = numa + numb;
    }
    if(operand == "-"){
        result = numa - numb;
    }
    if(operand == "/"){
        result = numa / numb;
    }
    if(operand == "*"){
        result = numa * numb;
    }
    if(operand == "power"){
        result = Math.pow(numa, numb);
    }
    return result;
  }
  static String pascii( boolean adash, char chr, boolean bdash) {
    if(adash == true){
        if(bdash == true){
            System.out.printf("\n%d\n", (int)chr);
        }
        if(bdash == false){
            System.out.printf("\n%d", (int)chr);
        }
    }

    if(adash == false){
        if(bdash == true){
            System.out.printf("%d\n", (int)chr);
        }
        if(bdash == false){
            System.out.printf("%d", (int)chr);
        }
    }
    //System.out.printf("%d", (int)chr);
    return "success";
  }
  private static void createAndShowGUIwmb(String title, String massage) {
        //Create and set up the window.
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
 
        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel(massage);
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));
 
        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
  }
  public static void main(String[] args) throws IOException {
    pascii( true, 'd', true);
    print("I just got!");
    double g = calculate(1, "+", 2);
    print(g);
    char b = convertatol(100);
    print(b);
    /*String basea = input("enter number of characters for base of piramid: ");
    String v = input("enter character for the piramid: ");
    int x = Integer.parseInt(basea);
    trianglerightcorner(x, v);*/
    getlocation("192.168.1.13");
    /*javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //createAndShowGUIbasic("my title", "massage");
                createAndShowGUIwmb("my title", "a");
            }
    });*/
  }
}

// Outputs "I just got executed!"

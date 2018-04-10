package com.example.bookclass;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Book abook;
        boolean form=false;
        String answer="";

        ArrayList<Book>allbooks=new ArrayList<Book>();

        while(form!=true){

            abook=new Book();

            System.out.println("Enter Book Title:");
            abook.setTitle(scan.nextLine());

            System.out.println("Enter Author:");
            abook.setAuthor(scan.nextLine());

            System.out.println("Enter Book Desccription:");
            abook.setDescription(scan.nextLine());

            System.out.println("Enter Price:");
            abook.setPrice(scan.nextLine());

            System.out.println("Enter Instock:");
            abook.setInstock(scan.nextLine());

            System.out.println("Do You want Enter Another Book? (Y/N)");
              answer=scan.nextLine();
            if(answer.equalsIgnoreCase("y")){
               form=false;
            }else{
                form= true;
            }

        }
        System.out.println();
        for (Book z:allbooks){
            System.out.println(z);
        }
        System.out.println();

        for(Book eachBook: allbooks){
            System.out.println("These are details of Book:Title ");

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116405.fahrih.fatahilah;

import java.util.Scanner;

/**
 *Nama  : Fahrih Fatahilah
 *Kelas : PBO2/IF-2
 *NIM   : 10116405
 *Deskripsi Program : Aplikasi Kasir BarberShop
 */
public class QUIZIF210116405FahrihFatahilah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Customer cus = new Customer();
        ServicePrice serP = new ServicePrice();
        Scanner customername = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner price = new Scanner(System.in);
        Scanner memberstatus = new Scanner(System.in);

        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        cus.setName(customername.nextLine());
        System.out.print("Customer Email : ");
        cus.setEmail(email.nextLine());
        serP.displayService();
        serP.setPriceService(serP.getPrice(price.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        cus.setMember(serP.checkMemberStatus(memberstatus.next()));

        System.out.println("\n#*************************************#");
        System.out.println("#**********CUSTOMER INVOICE***********#");
        System.out.println("Data Transaction : "+cus.currentTime());
        System.out.println("Service Price : Rp."+serP.getPriceService());
        System.out.println("Discount : Rp."+serP.getSale(cus.isMember(),serP.getPriceService()));
        System.out.println("Total Pay : Rp."+serP.getTotalPay(serP.getPriceService(),
                serP.getSale(cus.isMember(),serP.getPriceService())));
    }
    }
    

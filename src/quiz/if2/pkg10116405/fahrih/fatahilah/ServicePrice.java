/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116405.fahrih.fatahilah;

/**
 *
 * @author fahri
 */
public class ServicePrice implements ServiceItem{
 private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }
    
    public float getPrice(int serviceItem) {
        float price = 0;
        
        switch (serviceItem) {
            case 1:
                price = 45000;
                break;
            case 2:
                price = 55000;
                break;
            case 3:
                price = 15000;
                break;
        }
        
        return price;
    }
    
    public boolean checkMemberStatus(String statusMember) {
        boolean status = false;
        
        statusMember = statusMember.toLowerCase();
        if (statusMember.equals("yes")) {
            status = true;
        }
        
        return status;
    }
    
    public float getSale(boolean isMember, float parServicePrice) {
        float sale = 0;
        
        if (isMember) {
            sale = parServicePrice * 10 / 100;
        }
        
        return sale;
    }
    
    public float getTotalPay(float priceService, float discount) {
        return priceService - discount;
    }
}

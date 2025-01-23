/***********************************************************************
 * Module:  PresidentialSuit.java
 * Author:  USER
 * Purpose: Defines the Class PresidentialSuit
 ***********************************************************************/

import java.util.*;

/** @pdOid 13a79dac-f10b-4d56-87d1-3785286932b0 */
public class PresidentialSuit {
   /** @pdOid 9838f724-a3ec-4637-be52-b3804fcfaf21 */
   private String fasilitasPresidential;
   /** @pdOid 9ddd60ba-325b-4839-9b65-46ab99a51b29 */
   private Integer pricePresidential;
   /** @pdOid 6edb1995-71d7-4c1b-9f74-f87d0582573e */
   private int floorPresidential;
   
   /** @pdOid 3808da73-4c2a-4349-9e5c-7fae4af62359 */
   public String getFasilitasPresidential() {
      return fasilitasPresidential;
   }
   
   /** @param newFasilitasPresidential
    * @pdOid 8af4366f-c230-4048-927f-5c40e6dd06dd */
   public void setFasilitasPresidential(String newFasilitasPresidential) {
      fasilitasPresidential = newFasilitasPresidential;
   }
   
   /** @pdOid cec3edae-e9d1-4348-ab80-55974a0eaeb7 */
   public Integer getPricePresidential() {
      return pricePresidential;
   }
   
   /** @param newPricePresidential
    * @pdOid 748a8d8b-63ef-4231-adce-309a23b5c383 */
   public void setPricePresidential(Integer newPricePresidential) {
      pricePresidential = newPricePresidential;
   }

}
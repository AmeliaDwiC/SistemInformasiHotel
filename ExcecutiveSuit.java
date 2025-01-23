/***********************************************************************
 * Module:  ExcecutiveSuit.java
 * Author:  USER
 * Purpose: Defines the Class ExcecutiveSuit
 ***********************************************************************/

import java.util.*;

/** @pdOid 51e9f7a8-f61f-41a7-919d-09c16d2bc648 */
public class ExcecutiveSuit {
   /** @pdOid 3ff06cd7-39e7-4607-bf37-1104710b27c2 */
   private String fasilitasExcecutive;
   /** @pdOid 34e6e0f5-d614-4107-95be-e9482208a688 */
   private Integer priceExcecutive;
   /** @pdOid 775dea8c-a4a5-4a85-a7b5-fa78db16a456 */
   private int floorExcecutive;
   
   /** @pdOid 44f4712c-f25a-40e9-b16d-7e79ddd6d1d9 */
   public String getFasilitasExcecutive() {
      return fasilitasExcecutive;
   }
   
   /** @param newFasilitasExcecutive
    * @pdOid 91fd9989-f53d-43b6-a686-65c892acd378 */
   public void setFasilitasExcecutive(String newFasilitasExcecutive) {
      fasilitasExcecutive = newFasilitasExcecutive;
   }
   
   /** @pdOid 0b7b8047-3c1e-458c-a510-2522068446e3 */
   public Integer getPriceExcecutive() {
      return priceExcecutive;
   }
   
   /** @param newPriceExcecutive
    * @pdOid 602fbc25-4ee1-43d7-8639-db938c5a4c5a */
   public void setPriceExcecutive(Integer newPriceExcecutive) {
      priceExcecutive = newPriceExcecutive;
   }

}
/***********************************************************************
 * Module:  ExcecutiveSuit.java
 * Author:  Nata
 * Purpose: Defines the Class ExcecutiveSuit
 ***********************************************************************/

import java.util.*;

/** @pdOid 51e9f7a8-f61f-41a7-919d-09c16d2bc648 */
public class ExcecutiveSuit extends Room {
   /** @pdOid b7b9bf1b-791d-46a9-89cc-2c63bd4d1eb0 */
   private Integer idExcecutive;
   /** @pdOid 3ff06cd7-39e7-4607-bf37-1104710b27c2 */
   private String fasilitas;
   /** @pdOid 34e6e0f5-d614-4107-95be-e9482208a688 */
   private Integer price;
   
   /** @pdOid d91086bb-b3fc-4c85-a1e9-fae60df3d938 */
   public Integer getIdExcecutive() {
      return idExcecutive;
   }
   
   /** @param newIdExcecutive
    * @pdOid a41b4937-8823-4db9-8c24-4ed5fc8f9c87 */
   public void setIdExcecutive(Integer newIdExcecutive) {
      idExcecutive = newIdExcecutive;
   }
   
   /** @pdOid 44f4712c-f25a-40e9-b16d-7e79ddd6d1d9 */
   public String getFasilitas() {
      return fasilitas;
   }
   
   /** @param newFasilitas
    * @pdOid 91fd9989-f53d-43b6-a686-65c892acd378 */
   public void setFasilitas(String newFasilitas) {
      fasilitas = newFasilitas;
   }
   
   /** @pdOid 0b7b8047-3c1e-458c-a510-2522068446e3 */
   public Integer getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid 602fbc25-4ee1-43d7-8639-db938c5a4c5a */
   public void setPrice(Integer newPrice) {
      price = newPrice;
   }

}
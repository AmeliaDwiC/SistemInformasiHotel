/***********************************************************************
 * Module:  PresidentialSuit.java
 * Author:  Nata
 * Purpose: Defines the Class PresidentialSuit
 ***********************************************************************/

import java.util.*;

/** @pdOid 13a79dac-f10b-4d56-87d1-3785286932b0 */
public class PresidentialSuit extends Room {
   /** @pdOid 70a2e927-af80-4a1d-9184-b04731c5c76b */
   private Integer idPresidential;
   /** @pdOid 9838f724-a3ec-4637-be52-b3804fcfaf21 */
   private String fasilitas;
   /** @pdOid 9ddd60ba-325b-4839-9b65-46ab99a51b29 */
   private Integer price;
   
   /** @pdOid 3ef726f8-e9dc-4f32-bcfb-54410e90ad65 */
   public Integer getIdPresidential() {
      return idPresidential;
   }
   
   /** @param newIdPresidential
    * @pdOid 6aa685fc-7bc0-4d16-94a0-3dbbe1745747 */
   public void setIdPresidential(Integer newIdPresidential) {
      idPresidential = newIdPresidential;
   }
   
   /** @pdOid 3808da73-4c2a-4349-9e5c-7fae4af62359 */
   public String getFasilitas() {
      return fasilitas;
   }
   
   /** @param newFasilitas
    * @pdOid 8af4366f-c230-4048-927f-5c40e6dd06dd */
   public void setFasilitas(String newFasilitas) {
      fasilitas = newFasilitas;
   }
   
   /** @pdOid cec3edae-e9d1-4348-ab80-55974a0eaeb7 */
   public Integer getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid 748a8d8b-63ef-4231-adce-309a23b5c383 */
   public void setPrice(Integer newPrice) {
      price = newPrice;
   }

}
/***********************************************************************
 * Module:  Reservasi.java
 * Author:  Nata
 * Purpose: Defines the Class Reservasi
 ***********************************************************************/

import java.util.*;

/** @pdOid 01012cd5-912e-482b-a138-05c91619eb2d */
public class Reservasi {
   /** @pdOid 6e337f4d-60e9-473c-99b8-841ac2eef97a */
   private Integer idReservasi;
   /** @pdOid 83767af4-4f8c-47c8-a042-36dbabcb5780 */
   private Date tglCheckIn;
   /** @pdOid 5a533819-d023-445d-b6d2-7bfe29f4a510 */
   private Date tglCheckOut;
   /** @pdOid 31caf351-efa8-4dcc-9366-3a440772bf37 */
   private Integer totalBiaya;
   
   /** @pdRoleInfo migr=no name=Pembayaran assc=association13 mult=0..1 */
   public Pembayaran pembayaran;
   
   /** @pdOid 8b64017b-6fe2-4473-9b9d-fb3b1879d7be */
   public Integer getIdReservasi() {
      return idReservasi;
   }
   
   /** @param newIdReservasi
    * @pdOid 58f9b2f8-42d3-4a2f-b5a4-43e05099327c */
   public void setIdReservasi(Integer newIdReservasi) {
      idReservasi = newIdReservasi;
   }
   
   /** @pdOid a94f43fa-d09b-4125-8429-ec69d89a9cde */
   public Date getTglCheckIn() {
      return tglCheckIn;
   }
   
   /** @param newTglCheckIn
    * @pdOid b00a1227-d557-463c-83dd-db6bc3050a38 */
   public void setTglCheckIn(Date newTglCheckIn) {
      tglCheckIn = newTglCheckIn;
   }
   
   /** @pdOid f982f304-feff-492f-8af3-7b56096f83c9 */
   public Date getTglCheckOut() {
      return tglCheckOut;
   }
   
   /** @param newTglCheckOut
    * @pdOid 484f3904-6f2f-4d7d-a57d-c4f12f084928 */
   public void setTglCheckOut(Date newTglCheckOut) {
      tglCheckOut = newTglCheckOut;
   }
   
   /** @pdOid 5fab9dc7-03ce-4cfa-9f92-043ea7fee8ab */
   public Integer getTotalBiaya() {
      return totalBiaya;
   }
   
   /** @param newTotalBiaya
    * @pdOid 276a7a95-9f60-463d-8a6a-823302416221 */
   public void setTotalBiaya(Integer newTotalBiaya) {
      totalBiaya = newTotalBiaya;
   }

}
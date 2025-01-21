/***********************************************************************
 * Module:  Pembayaran.java
 * Author:  Nata
 * Purpose: Defines the Class Pembayaran
 ***********************************************************************/

import java.util.*;

/** @pdOid 9b23e72e-f5b3-4126-ba68-fc6f8c26d4ee */
public class Pembayaran {
   /** @pdOid 97558a1a-070f-49e5-a776-72404227e241 */
   private Integer idPembayaran;
   /** @pdOid fac93260-10d8-4fb2-8a70-ddb8dbcc6bae */
   private String metodePembayaran;
   /** @pdOid 899ac16e-94ce-4f97-8c84-b67a1807243c */
   private Date tanggalPembayaran;
   /** @pdOid 6d21aa84-400c-4f61-801f-18634095865d */
   private Integer jumlahPembayaran;
   /** @pdOid 9a9220ed-90ae-4773-8b54-6fd126f84adf */
   private String statusPemesanan;
   
   /** @pdOid 1033b979-8c7b-4d65-a723-a74d162bcfd6 */
   public Integer getIdPembayaran() {
      return idPembayaran;
   }
   
   /** @param newIdPembayaran
    * @pdOid fe1bb329-6144-49db-b822-3c3edefe6d1c */
   public void setIdPembayaran(Integer newIdPembayaran) {
      idPembayaran = newIdPembayaran;
   }
   
   /** @pdOid 3f008a6d-e1cf-403d-9a04-3aa4cbe6145c */
   public String getMetodePembayaran() {
      return metodePembayaran;
   }
   
   /** @param newMetodePembayaran
    * @pdOid df9542a5-d9ad-4c5d-9da4-5f13dd53fdee */
   public void setMetodePembayaran(String newMetodePembayaran) {
      metodePembayaran = newMetodePembayaran;
   }
   
   /** @pdOid 630b58eb-8f93-494c-9585-ff0e2955417d */
   public Date getTanggalPembayaran() {
      return tanggalPembayaran;
   }
   
   /** @param newTanggalPembayaran
    * @pdOid d71e7124-60a8-4d8b-afa3-febc622e7c69 */
   public void setTanggalPembayaran(Date newTanggalPembayaran) {
      tanggalPembayaran = newTanggalPembayaran;
   }
   
   /** @pdOid e64488ff-8bbd-4176-a4ff-24340c1c1815 */
   public Integer getJumlahPembayaran() {
      return jumlahPembayaran;
   }
   
   /** @param newJumlahPembayaran
    * @pdOid f79f678a-73eb-4135-b404-ba2dab715524 */
   public void setJumlahPembayaran(Integer newJumlahPembayaran) {
      jumlahPembayaran = newJumlahPembayaran;
   }
   
   /** @pdOid cb83efc6-f23f-4274-940a-f471c9f991bd */
   public String getStatusPemesanan() {
      return statusPemesanan;
   }
   
   /** @param newStatusPemesanan
    * @pdOid 4360d0d5-16c1-45df-ae41-9f68ec941a30 */
   public void setStatusPemesanan(String newStatusPemesanan) {
      statusPemesanan = newStatusPemesanan;
   }

}
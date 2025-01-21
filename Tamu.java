/***********************************************************************
 * Module:  Tamu.java
 * Author:  Nata
 * Purpose: Defines the Class Tamu
 ***********************************************************************/

import java.util.*;

/** @pdOid 6324d869-e0b3-4be0-9756-0f6235e1925c */
public class Tamu {
   /** @pdOid eca89a46-a0eb-4b2f-ae19-2f33b65a3c7a */
   private Integer idTamu;
   /** @pdOid affc43ee-04e0-4bbe-af9a-3b2084d58068 */
   private String nama;
   /** @pdOid 66be4ba0-ec4c-433b-8464-f7facdfdea44 */
   private String email;
   /** @pdOid 2c3ca666-2c33-4e21-9cba-ac284a0fc5dc */
   private String telefon;
   
   /** @pdRoleInfo migr=no name=Reservasi assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservasi> reservasi;
   
   /** @pdOid 0a724381-8dba-4194-bbdf-1c887d0bb501 */
   public Integer getIdTamu() {
      return idTamu;
   }
   
   /** @param newIdTamu
    * @pdOid abb1bf6c-ef53-4c35-a366-9249be609c80 */
   public void setIdTamu(Integer newIdTamu) {
      idTamu = newIdTamu;
   }
   
   /** @pdOid 45afe112-9400-4403-935e-4f4bb4d11ddf */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 62c4f3a7-be9c-443d-aaa0-71569b17e04a */
   public void setNama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid 064fbb09-9dd4-4064-9764-91654d9cb408 */
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 72a42bee-ddc4-4966-a95a-a076d05a20cb */
   public void setEmail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 2f9b676c-5597-4a16-af10-6b70457cc08f */
   public String getTelefon() {
      return telefon;
   }
   
   /** @param newTelefon
    * @pdOid 96c0b6ea-9261-4c20-ae76-3debb790e2fc */
   public void setTelefon(String newTelefon) {
      telefon = newTelefon;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reservasi> getReservasi() {
      if (reservasi == null)
         reservasi = new java.util.HashSet<Reservasi>();
      return reservasi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservasi() {
      if (reservasi == null)
         reservasi = new java.util.HashSet<Reservasi>();
      return reservasi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservasi */
   public void setReservasi(java.util.Collection<Reservasi> newReservasi) {
      removeAllReservasi();
      for (java.util.Iterator iter = newReservasi.iterator(); iter.hasNext();)
         addReservasi((Reservasi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservasi */
   public void addReservasi(Reservasi newReservasi) {
      if (newReservasi == null)
         return;
      if (this.reservasi == null)
         this.reservasi = new java.util.HashSet<Reservasi>();
      if (!this.reservasi.contains(newReservasi))
         this.reservasi.add(newReservasi);
   }
   
   /** @pdGenerated default remove
     * @param oldReservasi */
   public void removeReservasi(Reservasi oldReservasi) {
      if (oldReservasi == null)
         return;
      if (this.reservasi != null)
         if (this.reservasi.contains(oldReservasi))
            this.reservasi.remove(oldReservasi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservasi() {
      if (reservasi != null)
         reservasi.clear();
   }

}
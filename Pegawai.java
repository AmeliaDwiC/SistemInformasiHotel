/***********************************************************************
 * Module:  Pegawai.java
 * Author:  Nata
 * Purpose: Defines the Class Pegawai
 ***********************************************************************/

import java.util.*;

/** @pdOid 852cf4c5-98a6-4cb5-9455-eb80a6e35914 */
public class Pegawai {
   /** @pdOid 0b61a0e3-106e-4a69-9e30-e0d32abc73ca */
   private Integer idPegawai;
   /** @pdOid f1a551eb-d9c0-43a3-a829-a1f97d9d055f */
   private String nama;
   
   /** @pdRoleInfo migr=no name=Tamu assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Tamu> tamu;
   
   /** @pdOid c700a003-e194-4762-96b1-9fc461ddba3e */
   public Integer getIdPegawai() {
      return idPegawai;
   }
   
   /** @param newIdPegawai
    * @pdOid 10f07b29-c8c4-422a-83f2-ac021731d1b6 */
   public void setIdPegawai(Integer newIdPegawai) {
      idPegawai = newIdPegawai;
   }
   
   /** @pdOid 06ba568c-d191-412b-828c-dedc889dd4e5 */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 1bc03780-2870-42fd-ad26-16682e49c81e */
   public void setNama(String newNama) {
      nama = newNama;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tamu> getTamu() {
      if (tamu == null)
         tamu = new java.util.HashSet<Tamu>();
      return tamu;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTamu() {
      if (tamu == null)
         tamu = new java.util.HashSet<Tamu>();
      return tamu.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTamu */
   public void setTamu(java.util.Collection<Tamu> newTamu) {
      removeAllTamu();
      for (java.util.Iterator iter = newTamu.iterator(); iter.hasNext();)
         addTamu((Tamu)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTamu */
   public void addTamu(Tamu newTamu) {
      if (newTamu == null)
         return;
      if (this.tamu == null)
         this.tamu = new java.util.HashSet<Tamu>();
      if (!this.tamu.contains(newTamu))
         this.tamu.add(newTamu);
   }
   
   /** @pdGenerated default remove
     * @param oldTamu */
   public void removeTamu(Tamu oldTamu) {
      if (oldTamu == null)
         return;
      if (this.tamu != null)
         if (this.tamu.contains(oldTamu))
            this.tamu.remove(oldTamu);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTamu() {
      if (tamu != null)
         tamu.clear();
   }

}
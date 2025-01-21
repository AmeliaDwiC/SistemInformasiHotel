/***********************************************************************
 * Module:  Hotel.java
 * Author:  Nata
 * Purpose: Defines the Class Hotel
 ***********************************************************************/

import java.util.*;

/** @pdOid 79d0ae4f-e450-45ef-98d6-0690665c4d85 */
public class Hotel {
   /** @pdOid ef496dfb-d43e-48c3-a35b-110aab2c3bb4 */
   private Integer idHotel;
   /** @pdOid 904c318b-f80e-4001-9bda-d1560b1653ee */
   private String namaHotel;
   /** @pdOid ba5d9c07-0524-4862-a7e2-a0d7507d3b8a */
   private String alamat;
   
   /** @pdRoleInfo migr=no name=Tamu assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Tamu> tamu;
   /** @pdRoleInfo migr=no name=Room assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Room> room;
   /** @pdRoleInfo migr=no name=Pegawai assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Pegawai> pegawai;
   
   /** @pdOid efa26e75-7b86-4422-af9a-0c144e6ac904 */
   public Integer getIdHotel() {
      return idHotel;
   }
   
   /** @param newIdHotel
    * @pdOid 6fbe7e86-f463-4f67-b5ea-95b9f0594cfe */
   public void setIdHotel(Integer newIdHotel) {
      idHotel = newIdHotel;
   }
   
   /** @pdOid 5fa2f511-02b9-488f-a1aa-b11c146e1e28 */
   public String getNamaHotel() {
      return namaHotel;
   }
   
   /** @param newNamaHotel
    * @pdOid 755e5fdb-7d5a-467e-bd4e-bf713fe085a1 */
   public void setNamaHotel(String newNamaHotel) {
      namaHotel = newNamaHotel;
   }
   
   /** @pdOid 1ed64b68-684a-4188-8315-b6c1c5d955e4 */
   public String getAlamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 1b6e2bd2-4a33-4c5c-b1d6-22e399f99064 */
   public void setAlamat(String newAlamat) {
      alamat = newAlamat;
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
   /** @pdGenerated default getter */
   public java.util.Collection<Room> getRoom() {
      if (room == null)
         room = new java.util.HashSet<Room>();
      return room;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRoom() {
      if (room == null)
         room = new java.util.HashSet<Room>();
      return room.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRoom */
   public void setRoom(java.util.Collection<Room> newRoom) {
      removeAllRoom();
      for (java.util.Iterator iter = newRoom.iterator(); iter.hasNext();)
         addRoom((Room)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRoom */
   public void addRoom(Room newRoom) {
      if (newRoom == null)
         return;
      if (this.room == null)
         this.room = new java.util.HashSet<Room>();
      if (!this.room.contains(newRoom))
         this.room.add(newRoom);
   }
   
   /** @pdGenerated default remove
     * @param oldRoom */
   public void removeRoom(Room oldRoom) {
      if (oldRoom == null)
         return;
      if (this.room != null)
         if (this.room.contains(oldRoom))
            this.room.remove(oldRoom);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRoom() {
      if (room != null)
         room.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Pegawai> getPegawai() {
      if (pegawai == null)
         pegawai = new java.util.HashSet<Pegawai>();
      return pegawai;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPegawai() {
      if (pegawai == null)
         pegawai = new java.util.HashSet<Pegawai>();
      return pegawai.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPegawai */
   public void setPegawai(java.util.Collection<Pegawai> newPegawai) {
      removeAllPegawai();
      for (java.util.Iterator iter = newPegawai.iterator(); iter.hasNext();)
         addPegawai((Pegawai)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPegawai */
   public void addPegawai(Pegawai newPegawai) {
      if (newPegawai == null)
         return;
      if (this.pegawai == null)
         this.pegawai = new java.util.HashSet<Pegawai>();
      if (!this.pegawai.contains(newPegawai))
         this.pegawai.add(newPegawai);
   }
   
   /** @pdGenerated default remove
     * @param oldPegawai */
   public void removePegawai(Pegawai oldPegawai) {
      if (oldPegawai == null)
         return;
      if (this.pegawai != null)
         if (this.pegawai.contains(oldPegawai))
            this.pegawai.remove(oldPegawai);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPegawai() {
      if (pegawai != null)
         pegawai.clear();
   }

}
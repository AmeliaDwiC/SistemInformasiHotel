/***********************************************************************
 * Module:  SuiteRoom.java
 * Author:  Nata
 * Purpose: Defines the Class SuiteRoom
 ***********************************************************************/

import java.util.*;

/** @pdOid dd0010eb-36d1-4820-ac84-eff8981dca67 */
public class SuiteRoom extends Room {
   /** @pdOid 879682ae-f8d2-43d5-a50f-fca0f3bcb856 */
   private Integer idSuite;
   /** @pdOid f8632e07-7dc5-4745-9c44-a97c622f8ce1 */
   private String fasilitas;
   /** @pdOid b74d9008-fb78-46ff-b472-aac404423486 */
   private Integer price;
   
   /** @pdOid 593f2d26-e883-4ba2-9163-51a70f585f2f */
   public Integer getIdSuite() {
      return idSuite;
   }
   
   /** @param newIdSuite
    * @pdOid 2893cd23-f11a-4181-bccd-4f5a60f12d52 */
   public void setIdSuite(Integer newIdSuite) {
      idSuite = newIdSuite;
   }
   
   /** @pdOid 1fa8eb37-f70c-4056-b422-dcfc21ae89f2 */
   public String getFasilitas() {
      return fasilitas;
   }
   
   /** @param newFasilitas
    * @pdOid 34cf6e2f-67e3-40b0-a827-8862695d0ee6 */
   public void setFasilitas(String newFasilitas) {
      fasilitas = newFasilitas;
   }
   
   /** @pdOid 77916567-1f62-467a-a483-c7671e0ec442 */
   public Integer getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid e11fa618-6556-4dd7-8daa-e34d2061c818 */
   public void setPrice(Integer newPrice) {
      price = newPrice;
   }

}
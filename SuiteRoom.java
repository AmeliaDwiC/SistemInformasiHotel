/***********************************************************************
 * Module:  SuiteRoom.java
 * Author:  USER
 * Purpose: Defines the Class SuiteRoom
 ***********************************************************************/

import java.util.*;

/** @pdOid dd0010eb-36d1-4820-ac84-eff8981dca67 */
public class SuiteRoom {
   /** @pdOid f8632e07-7dc5-4745-9c44-a97c622f8ce1 */
   private String fasilitasSuite;
   /** @pdOid b74d9008-fb78-46ff-b472-aac404423486 */
   private Integer priceSuite;
   /** @pdOid 7649d23e-63b4-4b6d-a561-532de0989ef5 */
   private int floorSuite;
   
   /** @pdOid 1fa8eb37-f70c-4056-b422-dcfc21ae89f2 */
   public String getFasilitasSuite() {
      return fasilitasSuite;
   }
   
   /** @param newFasilitasSuite
    * @pdOid 34cf6e2f-67e3-40b0-a827-8862695d0ee6 */
   public void setFasilitasSuite(String newFasilitasSuite) {
      fasilitasSuite = newFasilitasSuite;
   }
   
   /** @pdOid 77916567-1f62-467a-a483-c7671e0ec442 */
   public Integer getPriceSuite() {
      return priceSuite;
   }
   
   /** @param newPriceSuite
    * @pdOid e11fa618-6556-4dd7-8daa-e34d2061c818 */
   public void setPriceSuite(Integer newPriceSuite) {
      priceSuite = newPriceSuite;
   }

}
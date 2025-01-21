/***********************************************************************
 * Module:  Room.java
 * Author:  Nata
 * Purpose: Defines the Class Room
 ***********************************************************************/

import java.util.*;

/** @pdOid 50095d7e-0712-490e-885f-79c561492edc */
public class Room {
   /** @pdOid f7f3fca2-45f4-47a9-a351-e5c861e8188a */
   private Integer idRoom;
   /** @pdOid c94cef8e-b71c-4c9d-ad2d-7ec99cdb84ad */
   private Integer price;
   /** @pdOid be68f653-3f4e-4a70-945d-875ad90dc164 */
   private String status;
   
   /** @pdRoleInfo migr=no name=Reservasi assc=association12 mult=0..1 */
   public Reservasi reservasi;
   
   /** @pdOid 9ceb1caa-e2c2-4d2a-8740-db76df97f21e */
   public Integer getPrice() {
      return price;
   }
   
   /** @param newPrice
    * @pdOid 1355e7c2-4d07-4701-9319-81849023f167 */
   public void setPrice(Integer newPrice) {
      price = newPrice;
   }
   
   /** @pdOid c10e7824-9155-412a-9b3a-8aa5a6e7d31b */
   public String getStatus() {
      return status;
   }
   
   /** @param newStatus
    * @pdOid 13f52238-e41b-461f-ab17-78324dc8c80d */
   public void setStatus(String newStatus) {
      status = newStatus;
   }

}
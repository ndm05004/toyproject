package model;

import java.sql.Timestamp;

public class MemVO {
   private String memId;
   private String memName;
   private String memPw;
   private String memAddr;
   private String memPhon;
   private int memMileage;
   private String memRegno1;
   private String memRegno2;
   private Timestamp memRegistration;
   private String memEmail;
   
   // insert 할 때 사용
   public MemVO(String memId, String memName, String memPw, String memAddr, String memPhon, String memRegno1, String memRegno2, String memEmail) {
      this.memId = memId;
      this.memName = memName;
      this.memPw = memPw;
      this.memAddr = memAddr;
      this.memPhon = memPhon;
      this.memRegno1 = memRegno1;
      this.memRegno2 = memRegno2;
      this.memEmail = memEmail;
   }
   
   // select 할 때 사용(회원이 마이페이지 들어가면 조회할 것들) 
   public MemVO(String memId, String memName, String memAddr, String memPhon, int memMileage, String memRegno1,
         String memRegno2, Timestamp memRegistration, String memEmail) {
      super();
      this.memId = memId;
      this.memName = memName;
      this.memAddr = memAddr;
      this.memPhon = memPhon;
      this.memMileage = memMileage;
      this.memRegno1 = memRegno1;
      this.memRegno2 = memRegno2;
      this.memRegistration = memRegistration;
      this.memEmail = memEmail;
   }
   
   // update 할 때 사용(개인이 마이페이지에서 수정할 것들)
   public MemVO(String memAddr, String memPhon, String memEmail) {
      super();
      this.memAddr = memAddr;
      this.memPhon = memPhon;
      this.memEmail = memEmail;
   }



   public String getMemId() {
      return memId;
   }


   public void setMemId(String memId) {
      this.memId = memId;
   }

   public String getMemName() {
      return memName;
   }

   public void setMemName(String memName) {
      this.memName = memName;
   }

   public String getMemPw() {
      return memPw;
   }

   public void setMemPw(String memPw) {
      this.memPw = memPw;
   }

   public String getMemAddr() {
      return memAddr;
   }

   public void setMemAddr(String memAddr) {
      this.memAddr = memAddr;
   }

   public String getMemPhon() {
      return memPhon;
   }

   public void setMemPhon(String memPhon) {
      this.memPhon = memPhon;
   }

   public int getMemMileage() {
      return memMileage;
   }

   public void setMemMileage(int memMileage) {
      this.memMileage = memMileage;
   }

   public String getMemRegno1() {
      return memRegno1;
   }

   public void setMemRegno1(String memRegno1) {
      this.memRegno1 = memRegno1;
   }

   public String getMemRegno2() {
      return memRegno2;
   }

   public void setMemRegno2(String memRegno2) {
      this.memRegno2 = memRegno2;
   }

   public Timestamp getMemRegistration() {
      return memRegistration;
   }

   public void setMemRegistration(Timestamp memRegistration) {
      this.memRegistration = memRegistration;
   }

   public String getMemEmail() {
      return memEmail;
   }

   public void setMemEmail(String memEmail) {
      this.memEmail = memEmail;
   }

   @Override
   public String toString() {
      return "MemVO [memId=" + memId + ", memName=" + memName + ", memPw=" + memPw + ", memAddr=" + memAddr
            + ", memPhon=" + memPhon + ", memMileage=" + memMileage + ", memRegno1=" + memRegno1 + ", memRegno2="
            + memRegno2 + ", memRegistration=" + memRegistration + ", memEmail=" + memEmail + "]";
   }
}
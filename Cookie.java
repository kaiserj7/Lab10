class Cookie {
  private int cookieCount, cookieTemp, cookTime;
  private boolean isCookieBaked;

  Cookie()
  {
    cookieCount=0;
    cookieTemp=0;
    cookTime=0;
    isCookieBaked=false;

  }

  Cookie(int a, int b, int c)
  {
    cookieCount=a;
    cookieTemp=b;
    cookTime=c;
    isCookieBaked=false;
  }

  boolean isReady()
  {
    return isCookieBaked;
  }

  void setNumCookie(int a)
  {
    cookieCount=a;
  }
  void bakeCookies(int a, int b)
  {
    System.out.println(cookieCount+" cookies were baked at "+a+" degrees F for "+b+" minutes.");
    isCookieBaked=true;
    
  }

}
package IG.Factory;

public interface IContBancar {
   void transfer(IContBancar destinatie, double suma);
   void depune(double suma);
   void retragere(double suma);
}

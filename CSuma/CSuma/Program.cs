using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("primer número: ");
            string stringPrimerNumero = Console.ReadLine();
            decimal primerNumero = decimal.Parse(stringPrimerNumero);
            Console.WriteLine("segundo número: ");
            string stringsegundoNumero = Console.ReadLine();
            decimal segundoNumero = decimal.Parse(stringsegundoNumero);
            Console.WriteLine("primer numero= " + primerNumero + "segundo numero= "+segundoNumero);
            decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("suma = "+ suma);
        }
    }
}

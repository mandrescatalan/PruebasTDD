using PruebaFibonacci;
using System;

namespace TestFibonacci
{
    public class Tests
    {
        Fibonacci fibonacci;

        [SetUp]
        public void Setup()
        {
            fibonacci = new Fibonacci();
        }

        [Test]
        public void TestValorEsperado()
        {
            bool respuesta = fibonacci.serieFibonacci(3);
            Assert.That(respuesta, Is.EqualTo(true));
        }


        [Test]
        public void TestValorNull()
        {
            bool respuesta = fibonacci.serieFibonacci(null);
            Assert.That(respuesta, Is.EqualTo(false));
        }

       

        [Test]
        public void TestValorNegativo()
        {
            bool respuesta = fibonacci.serieFibonacci(-3);
            Assert.That(respuesta, Is.EqualTo(false));
        }

        [Test]
        public void TestValorCero()
        {
            bool respuesta = fibonacci.serieFibonacci(0);
            Assert.That(respuesta, Is.EqualTo(false));
        }


        [Test]
        public void TestValorFueraDelRango()
        {
            bool respuesta = fibonacci.serieFibonacci(110);
            Assert.That(respuesta, Is.EqualTo(false));
        }

        [Test]
        public void TestValorCaracter()
        {
            //try
            //{
            //    fibonacci.serieFibonacci(int.Parse("a"));
            //    Assert.Fail();
            //}
            //catch(FormatException e){}

            Assert.Throws<FormatException>(() => fibonacci.serieFibonacci(int.Parse("a")));

        }


    }
}
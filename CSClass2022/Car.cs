using System;

namespace CSClass2022
{
    class Car
    {
        int carNumber;
        DateTime inTime;
        DateTime outTime;

        public  void SetInTime()
        {
            this.inTime = DateTime.Now;
        }

        public void SetOutTime()
        {
            this.outTime = DateTime.Now;
        }
    }
}
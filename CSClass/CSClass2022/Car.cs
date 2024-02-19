using System;

namespace CSClass2022
{
    class Car
    {
        int carNumber;
        DateTime inTime;
        DateTime outTime;

        /// <summary>
        /// some 함수입니다!
        /// </summary>
        /// <param name="fpp">뭔가 변수</param>
        /// <return>뭔가 리턴값</return>
        public int some(int foo)
        {
            return foo * 10;
        }


        /// <summary>
        /// 자동차 입차 시간을 지정합니다!
        /// </summary>
        public void SetInTime()
        {
            this.inTime = DateTime.Now;
        }



        /// <summary>
        /// 자동차 출차 시간을 지정합니다!
        /// </summary>
        public void SetOutTime()
        {
            this.outTime = DateTime.Now;
        }
    }
}
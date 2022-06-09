using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StopWatch
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void button1_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            btn.Text = "더눌러봥";



            //sender는 어떤 버튼이 눌렸는지의 정보가 들어온다.
            ilStatus.Text += "+";
            tbSataus.Text += "+";

            if (Timer1.Enabled = false)
            {
                Timer.Enabled = true;
                elapsedTime = 0;
                ilStatus.Text += " ";
                tbSataus.Text += " ";
            }
            else
            {
                timer1.Enabled = false;
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            elapsedTime++;
            ilStatus.Text += elapsedTime+"초 경과";
            tbSataus.Text += "+";
            toolStatusProgressBar.Value = elapsedTime;
        }
        private int elapsedTime = 0;
    }
}

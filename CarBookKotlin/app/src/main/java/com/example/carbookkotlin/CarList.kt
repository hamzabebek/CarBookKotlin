package com.example.carbookkotlin

import android.icu.text.IDNA.Info
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carbookkotlin.databinding.ActivityCarListBinding

class CarList : AppCompatActivity() {
    private lateinit var binding : ActivityCarListBinding
    private lateinit var carlist : ArrayList<Cars>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        carlist = ArrayList<Cars>()

        //Data

        val e92m3 = Cars("BMW E92 M3","The M3 model of the E90/E92/E93 3 Series range was powered by the BMW S65 V8 engine and was produced in sedan, convertible and coupé body styles.The E9x is the first and only standard production M3 powered by a V8 engine as its successor would revert to using a straight 6 engine.In the standard M3, the S65 engine rated at 309 kW (420 PS; 414 hp) at 8,300 rpm and 400 N⋅m (295 lb⋅ft) at 3,900 rpm.Initially, the M3 was produced with a 6-speed manual transmission. In April 2008, the E90/E92/E93 M3 became the first BMW to be available with a dual-clutch transmission when the 7-speed Getrag M-DCT transmission was introduced as an option.",R.drawable.e92m3)
        val m3 = Cars("BMW G20 M3 2023","The M3 is BMW’s most iconic driver’s car, and the current model shows that the company still remembers what made many previous M cars instant favorites. The standard version of the current M3 is a rear-drive 473-hp sedan available only with a six-speed manual transmission. Opt for the 503-hp M3 Competition, and you’ll have to settle for an eight-speed automatic. The M3 Comp is available with either rear- or all-wheel drive, and its track-tuned chassis is stiff-riding to the point of being close to a race car-like experience. All M3s are quick:in our testing, the rear-drive Competition model’s 60-mph time of 3.5 seconds was 0.4 seconds quicker than our long-term base car’s.",R.drawable.m32023)
        val m4 = Cars("BMW G22 M4 2023","The standard M4 comes with rear-wheel drive, a six-speed manual transmission, and a fiery 473-hp twin-turbo inline-six engine; M4 Competition models have 503 horsepower.Both models can be had with an optional eight-speed automatic, the only transmission sold with the optional xDrive all-wheel-drive system.",R.drawable.bmwm4)
        val m5 = Cars("BMW G30 M5 2023","The F90 M5 is based on the G30 5 Series and uses an all-wheel drive (xDrive) powertrain, being the first time that an M5 has not been rear-wheel drive.However the all-wheel drive system is biased towards the rear wheels. It can also be configured to send power to the rear wheels only,if the electronic stability control (ESC) is disabled.The transmission is an 8-speed ZF GA8HP75Z automatic.The F90 M5 accelerates from a standstill to 100 km/h (62 mph) in 3.4 seconds,and to 200 km/h (124 mph) in 11.1 seconds.In imperial measurements 60 mph (97 km/h) is reached in 2.8 seconds and 100 mph (161 km/h) in 6.6 seconds. The standing quarter mile is achieved in 10.9 seconds, making this iteration of the M5 a 10-second car.The top speed is limited to 250 km/h (155 mph), and the delimited top speed is 305 km/h (190 mph) with the optional M Driver's Package.Despite the added weight of the all-wheel drive components, the weight of the F90 M5 is approximately 40 kg (88 lb) lower than the previous geration M5",R.drawable.m52022)
        val rs3 = Cars("AUDİ RS3 2023","If you tend to abide by the mantra that life is too short to drive boring cars—and we do—then the Audi RS3 is a compelling choice.The 401-hp RS3 is the A3 line’s steaming, bubbling, bowl of oatmeal. Next to it the base 201-hp A3 is cold mush and even the 306-hp S3 is only lukewarm porridge.The RS3’s turbocharged 2.5-liter five-cylinder engine pumps out 369 pound-feet of heat to go along with its impressive herd of ponies and sends it to all four wheels through a quick-shifting seven-speed dual clutch automatic and Audi’s Quattro all-wheel drive system. The RS3’s exterior design, interior layout, and aerodynamic aids ooze a strong sense of bad-boy energy. It’s a clear message that’s backed up by the RS3’s exceptional acceleration, deceleration, agility, stability, and driving thrills.",R.drawable.rs3)
        val rs6 = Cars("AUDİ RS6 2023","Audi endows the RS6 Avant with a twin-turbocharged 4.0-liter V-8, which generates 591 horsepower and 590 pound-feet of torque. The powerplant combines with a 48-volt hybrid system that's found on other Audi products, such as the A8 luxury sedan and the Q8 crossover.",R.drawable.rs6)
        val rs7 = Cars("AUDİ RS7 2023","The Audi RS7 is a largemouth high-performance hatchback sedan with swollen fenders and a spacious interior that’s chock full of the luxuries and high-tech gear you’d expect in a super-sedan. A 591-hp twin-turbocharged V-8 bolted to an eight-speed automatic transmission supplies the thrills with the help of standard all-wheel drive. The RS7 is nearly 5000 pounds, but thanks to its rear-wheel steering system and superb suspension it feels surprisingly nimble for its size. If this much horsepower is too much horsepower, there’s always the 444-hp S7, which we review separately. The RS7 is supremely comfortable and even extra-practical thanks to its hatchback body style.",R.drawable.rs7)
        val c63s = Cars("Mercedes C63s 2023","The 2021 Mercedes-AMG C63 and C63 S have a hand-built, twin-turbo 4.0-liter V-8 engine. In the C63, it makes 469 horsepower and 479 lb-ft of torque.The C63 S ups the performance ante with 503 horsepower and 516 lb-ft. Both engines use a nine-speed automatic with rear-wheel drive.",R.drawable.mercedesc63s)
        val e63 = Cars("Mercedes E63s 2023","The 2023 Mercedes-AMG E63 S marks the final chapter in the hot-rod division’s Book of Boosted V8s. The high-performance E-class sedan will likely follow in the tire tracks of the AMG C63, which receives a hybridized powertrain for the 2024 model year. Those looking to purchase an AMG E63 or place a factory order are likely aware that dealers were unable to fulfill orders for 2022 models after suspending sales of most V-8-powered vehicles in the U.S. But the company says its resuming sales for 2023, which is good news because the E63 S is a delightful machine, surging through space with its twin-turbo V8 pumping out 603 thundering horsepower and 627 pound-feet of torque, its multi-clutch nine-speed transmission delivering that power to all four wheels. The super saloon can muster up enough gall to take on most any of today’s super sedan, but it’s capable of much more than just being a ballistic missile. The wonderfully luxurious cabin can be a serene space for the driver and passengers and its air suspension can deliver a supple ride at the flick of the mode switch.This duality of personality is a key part of what makes the AMG E63 S so special. This is the E63 S’s final production year, and and that specialness will be missed.",R.drawable.mercedese63)
        val amggt = Cars("Mercedes AMG GT 2023","The absolutely stunning bodywork of the 2021 Mercedes-AMG GT will no doubt draw your eye, but it's more than just a pretty face. The low and wide GT is also an extremely capable high-performance sports car. This is Mercedes's front-engine answer to the rear-engine Porsche 911. Offered at various point points, the GT features a hand-built twin-turbo V-8. Although this AMG isn't as immersive to drive as its archrival from Porsche, it's still super athletic, and most models are surprisingly civil on streets that aren't racetrack smooth. Those who prefer a more refined grand tourer will appreciate the 523-hp GT and 550-hp GT C, and those with sportier desires will gravitate toward the 577-hp GT R and GT R Pro. Most models are available in coupe and softtop-roadster forms, but the track-focused Pro and almighty 720-hp Black Series are hardtop only.",R.drawable.amggt)

        carlist.add(e92m3)
        carlist.add(m3)
        carlist.add(m4)
        carlist.add(m5)
        carlist.add(rs3)
        carlist.add(rs6)
        carlist.add(rs7)
        carlist.add(c63s)
        carlist.add(e63)
        carlist.add(amggt)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val carlistadapter = carlistadapter(carlist)
        binding.recyclerView.adapter = carlistadapter
    }
}
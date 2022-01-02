
import spock.lang.Specification

class HelloSpockSpec extends Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}

//Nokia 8.3 5G 6.81 Inch Android UK SIM Free Smartphone with 5G Connectivity – 6 GB RAM and 64 GB Storage (Single SIM) – Polar Night £393.98
//OPPO Find X2 Neo 5G - Qualcomm® Snapdragon™ 765G mobile platform 6.5 inch  4025 mAh 48MP Zoom Camera 90Hz Smartphone - Blue £384.00
//OPPO Reno4 5G - 8 GB + 128 GB Snapdragon 765G 6.4 Inch 4020 mAh 48 MP Camera Sim Free Android 10 Dual Sim Smartphone - Blue £349.00
//realme X3 Super Zoom, Glacier Blue, 12GB+256GB, 6.57” 120Hz Screen, 4200 mAh Battery with 30W Dart Charge, Sim Free Smartphone, UK Plug £349.00
//OnePlus N10 5G 6GB RAM and 128GB Storage UK SIM-Free Smartphone with Quad Camera, Dual SIM and Warp Charge 30T - Midnight Ice - 2 Year Warranty £295.00
//OPPO Find X2 Lite 5G - Qualcomm® Snapdragon™ 765G mobile platform 6.4 inch 4250 mAh 48MP Camera Smartphone – White £275.00
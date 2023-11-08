package com.xworkz.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.CountryDTO;

public class CountryDTOMain {
	
	public static void main(String[] args) {
		
		CountryDTO countryDTO1=new CountryDTO(1,"Bharat","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO2=new CountryDTO(2,"Bhutan","thimbu",140000,1967,LocalDate.of(1967,8,15),5,"cham","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO3=new CountryDTO(3,"Neapal","katmandu",1400000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO4=new CountryDTO(4,"Bangaladash","Delhi",12000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO5=new CountryDTO(5,"SriLanka","Delhi",10000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO6=new CountryDTO(6,"Pakistan","Delhi",15000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO7=new CountryDTO(7,"Afganestan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO8=new CountryDTO(8,"China","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO9=new CountryDTO(9,"Kagigestan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO10=new CountryDTO(10,"japa","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO11=new CountryDTO(11,"france","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO12=new CountryDTO(12,"Isrial","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO13=new CountryDTO(13,"egypt","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO14=new CountryDTO(14,"dubai","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO15=new CountryDTO(15,"greece","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO16=new CountryDTO(16,"Albania","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO17=new CountryDTO(17,"Algeria","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO18=new CountryDTO(18,"Andorra","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO19=new CountryDTO(19,"Argentina","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO20=new CountryDTO(20,"Armenia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO21=new CountryDTO(21,"Australia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO22=new CountryDTO(22,"Austria","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO23=new CountryDTO(23,"Azerbaijan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO24=new CountryDTO(24,"Bahamas","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO25=new CountryDTO(25,"Bahrain","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO26=new CountryDTO(26,"Barbados","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO27=new CountryDTO(27,"Belarus","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO28=new CountryDTO(28,"Belgium","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO29=new CountryDTO(29,"Belize","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO30=new CountryDTO(30,"Benin","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO31=new CountryDTO(31,"Bhutan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO32=new CountryDTO(32,"Bolivia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO33=new CountryDTO(33,"Bosnia ","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO34=new CountryDTO(34,"Herzegovina","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO35=new CountryDTO(35,"Botswana","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO36=new CountryDTO(36,"Brazil","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO37=new CountryDTO(37,"Brunei","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO38=new CountryDTO(38,"Bulgaria","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO39=new CountryDTO(39,"Burkina","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO40=new CountryDTO(40,"Burundi","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO41=new CountryDTO(41,"Cabo Verde","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO42=new CountryDTO(42,"Cambodia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO43=new CountryDTO(43,"Cameroon","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO44=new CountryDTO(44,"Central African Republic","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO45=new CountryDTO(45,"Chile","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO46=new CountryDTO(46,"Comoros","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO47=new CountryDTO(47,"Colombia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO48=new CountryDTO(48,"Congo","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO49=new CountryDTO(49,"Costa Rica","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO50=new CountryDTO(50,"Croatia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO51=new CountryDTO(51,"Cuba","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO52=new CountryDTO(52,"Cyprus","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO53=new CountryDTO(53,"Czech Republic","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO54=new CountryDTO(54,"C�te d'Ivoire","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO55=new CountryDTO(55,"Denmark","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO56=new CountryDTO(56,"Djibouti","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO57=new CountryDTO(57,"Dominica","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO58=new CountryDTO(58,"Dominican Republic","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO59=new CountryDTO(59,"Ecuador","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO60=new CountryDTO(60,"Egypt","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO61=new CountryDTO(61,"El Salvador","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO62=new CountryDTO(62,"Equatorial Guinea","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO63=new CountryDTO(63,"Eritrea","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO64=new CountryDTO(64,"Estonia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO65=new CountryDTO(65,"Eswatini","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO66=new CountryDTO(66,"Ethiopia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO67=new CountryDTO(67,"Fiji","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO68=new CountryDTO(68,"Guinea-Bissau","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO69=new CountryDTO(69,"Guinea","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO70=new CountryDTO(70,"Guatemala","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO71=new CountryDTO(71,"Grenada","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO72=new CountryDTO(72,"Greece","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO73=new CountryDTO(73,"Ghana","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO74=new CountryDTO(74,"Germany","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO75=new CountryDTO(75,"Georgia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO76=new CountryDTO(76,"Gambia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO77=new CountryDTO(77,"Gabon","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO78=new CountryDTO(78,"France","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO79=new CountryDTO(79,"Finland","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO80=new CountryDTO(80,"Guyana","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO81=new CountryDTO(81,"Liberia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO82=new CountryDTO(82,"Lesotho","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO83=new CountryDTO(83,"Lebanon","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO84=new CountryDTO(84,"Latvia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO85=new CountryDTO(85,"Laos","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO86=new CountryDTO(86,"Kyrgyzstan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO87=new CountryDTO(87,"Kuwait","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO88=new CountryDTO(88,"Kiribati","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO89=new CountryDTO(89,"Kenya","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO90=new CountryDTO(90,"Kazakhstan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO91=new CountryDTO(91,"Jordan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO92=new CountryDTO(92,"Japan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO93=new CountryDTO(93,"Jamaica","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO94=new CountryDTO(94,"Italy","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO95=new CountryDTO(95,"Israel","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO96=new CountryDTO(96,"Ireland","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO97=new CountryDTO(97,"Iraq","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO98=new CountryDTO(98,"Iran","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO99=new CountryDTO(99,"Indonesia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO100=new CountryDTO(100,"Iceland","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO101=new CountryDTO(101,"Hungary","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO102=new CountryDTO(102,"Honduras","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO103=new CountryDTO(103,"Haiti","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO104=new CountryDTO(104,"Libya","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO105=new CountryDTO(105,"Moldova","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO106=new CountryDTO(106,"Micronesia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO107=new CountryDTO(107,"Mexico","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO108=new CountryDTO(108,"Mauritius","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO109=new CountryDTO(109,"Mauritania","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO110=new CountryDTO(110,"Marshall Islands","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO111=new CountryDTO(111,"Malta","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO112=new CountryDTO(112,"Mali","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO113=new CountryDTO(113,"Maldives","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO114=new CountryDTO(114,"Malaysia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO115=new CountryDTO(115,"Malawi","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO116=new CountryDTO(116,"Madagascar","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO117=new CountryDTO(117,"Luxembourg","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO118=new CountryDTO(118,"Lithuania","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO119=new CountryDTO(119,"Liechtenstein","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO120=new CountryDTO(120,"Monaco","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO121=new CountryDTO(121,"Papua New Guinea","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO122=new CountryDTO(122,"Panama","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO123=new CountryDTO(123,"Palestine State","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO124=new CountryDTO(124,"Palau","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO125=new CountryDTO(125,"Oman","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO126=new CountryDTO(126,"Norway","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO127=new CountryDTO(127,"North Macedonia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO128=new CountryDTO(128,"Nigeria","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO129=new CountryDTO(129,"Niger","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO130=new CountryDTO(130,"Nicaragua","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO131=new CountryDTO(131,"New Zealand","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO132=new CountryDTO(132,"Netherlands","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO133=new CountryDTO(133,"Nauru","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO134=new CountryDTO(134,"Namibia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO135=new CountryDTO(135,"Myanmar","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO136=new CountryDTO(136,"Mozambique","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO137=new CountryDTO(137,"Morocco","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO138=new CountryDTO(138,"Montenegro","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO139=new CountryDTO(139,"Mongolia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO140=new CountryDTO(140,"Paraguay ","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO141=new CountryDTO(141,"Seychelles","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO142=new CountryDTO(142,"Serbia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO143=new CountryDTO(143,"Senegal","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO144=new CountryDTO(144,"SAUDI ARABIA","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO145=new CountryDTO(145,"Sao Tome and Principe","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO146=new CountryDTO(146,"San Marino","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO147=new CountryDTO(147,"Samoa","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO148=new CountryDTO(148,"Saint Vincent and the Grenadines","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO149=new CountryDTO(149,"Saint Lucia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO150=new CountryDTO(150,"Saint Kitts and Nevis","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO151=new CountryDTO(151,"Rwanda","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO152=new CountryDTO(152,"Russia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO153=new CountryDTO(153,"Romania","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO154=new CountryDTO(154,"Qatar","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO155=new CountryDTO(155,"Portugal","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO156=new CountryDTO(156,"Poland","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO157=new CountryDTO(157,"Philippines","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO158=new CountryDTO(158,"Peru","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO159=new CountryDTO(159,"Sierra Leone ","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO160=new CountryDTO(160,"Thailand","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO161=new CountryDTO(161,"Tanzania","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO162=new CountryDTO(162,"Tajikistan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO163=new CountryDTO(163,"Syria","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO164=new CountryDTO(164,"Switzerland","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO165=new CountryDTO(165,"Suriname","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO166=new CountryDTO(166,"Sudan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO167=new CountryDTO(167,"Spain","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO168=new CountryDTO(168,"South Sudan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO169=new CountryDTO(169,"South Korea","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO170=new CountryDTO(170,"South Africa","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO171=new CountryDTO(171,"Somalia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO172=new CountryDTO(172,"Solomon Islands","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO173=new CountryDTO(173,"Slovenia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO174=new CountryDTO(174,"Slovakia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO175=new CountryDTO(175,"Singapore","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO176=new CountryDTO(176,"Timor-Leste","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO177=new CountryDTO(177,"Vatican City","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO178=new CountryDTO(178,"Vanuatu","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO179=new CountryDTO(179,"Uzbekistan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO180=new CountryDTO(180,"Uruguay","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO181=new CountryDTO(181,"United States of America","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO182=new CountryDTO(182,"United Kingdom","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO183=new CountryDTO(183,"United Arab Emirates","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO184=new CountryDTO(184,"Ukraine","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO185=new CountryDTO(185,"Uganda","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO186=new CountryDTO(186,"Tuvalu","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO187=new CountryDTO(187,"Turkmenistan","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO188=new CountryDTO(188,"Turkey","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO189=new CountryDTO(189,"Tunisia","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO190=new CountryDTO(190,"Trinidad and Tobago","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO191=new CountryDTO(191,"Tonga","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO192=new CountryDTO(192,"Togo","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO193=new CountryDTO(193,"Venezuela","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO194=new CountryDTO(194,"Zimbabwe","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		CountryDTO countryDTO195=new CountryDTO(195,"Yemen","Delhi",1400000000,1947,LocalDate.of(1947,8,15),30,"Hindu","Tiger","peapock","kabadi","Modi");
		
		Collection<CountryDTO> collection =new ArrayList();
		collection.add(countryDTO1);
		collection.add(countryDTO2);
		collection.add(countryDTO3);
		collection.add(countryDTO4);
		collection.add(countryDTO5);
		collection.add(countryDTO6);
		collection.add(countryDTO7);
		collection.add(countryDTO8);
		collection.add(countryDTO9);
		collection.add(countryDTO10);
		collection.add(countryDTO11);
		collection.add(countryDTO12);
		collection.add(countryDTO13);
		collection.add(countryDTO14);
		collection.add(countryDTO15);
		collection.add(countryDTO16);
		collection.add(countryDTO17);
		collection.add(countryDTO18);
		collection.add(countryDTO19);
		collection.add(countryDTO20);
		collection.add(countryDTO21);
		collection.add(countryDTO22);
		collection.add(countryDTO23);
		collection.add(countryDTO24);
		collection.add(countryDTO25);
		collection.add(countryDTO26);
		collection.add(countryDTO27);
		collection.add(countryDTO28);
		collection.add(countryDTO29);
		collection.add(countryDTO30);
		collection.add(countryDTO31);
		collection.add(countryDTO32);
		collection.add(countryDTO33);
		collection.add(countryDTO34);
		collection.add(countryDTO35);
		collection.add(countryDTO36);
		collection.add(countryDTO37);
		collection.add(countryDTO38);
		collection.add(countryDTO39);
		collection.add(countryDTO40);
		collection.add(countryDTO41);
		collection.add(countryDTO42);
		collection.add(countryDTO43);
		collection.add(countryDTO44);
		collection.add(countryDTO45);
		collection.add(countryDTO46);
		collection.add(countryDTO47);
		collection.add(countryDTO48);
		collection.add(countryDTO49);
		collection.add(countryDTO50);
		collection.add(countryDTO51);
		collection.add(countryDTO52);
		collection.add(countryDTO53);
		collection.add(countryDTO54);
		collection.add(countryDTO55);
		collection.add(countryDTO56);
		collection.add(countryDTO57);
		collection.add(countryDTO58);
		collection.add(countryDTO59);
		collection.add(countryDTO60);
		collection.add(countryDTO61);
		collection.add(countryDTO62);
		collection.add(countryDTO63);
		collection.add(countryDTO64);
		collection.add(countryDTO65);
		collection.add(countryDTO66);
		collection.add(countryDTO67);
		collection.add(countryDTO68);
		collection.add(countryDTO69);
		collection.add(countryDTO70);
		collection.add(countryDTO71);
		collection.add(countryDTO72);
		collection.add(countryDTO73);
		collection.add(countryDTO74);
		collection.add(countryDTO75);
		collection.add(countryDTO76);
		collection.add(countryDTO77);
		collection.add(countryDTO78);
		collection.add(countryDTO79);
		collection.add(countryDTO80);
		collection.add(countryDTO81);
		collection.add(countryDTO82);
		collection.add(countryDTO83);
		collection.add(countryDTO84);
		collection.add(countryDTO85);
		collection.add(countryDTO86);
		collection.add(countryDTO87);
		collection.add(countryDTO88);
		collection.add(countryDTO89);
		collection.add(countryDTO90);
		collection.add(countryDTO91);
		collection.add(countryDTO92);
		collection.add(countryDTO93);
		collection.add(countryDTO94);
		collection.add(countryDTO95);
		collection.add(countryDTO96);
		collection.add(countryDTO97);
		collection.add(countryDTO98);
		collection.add(countryDTO99);
		collection.add(countryDTO100);
		collection.add(countryDTO101);
		collection.add(countryDTO102);
		collection.add(countryDTO103);
		collection.add(countryDTO104);
		collection.add(countryDTO105);
		collection.add(countryDTO106);
		collection.add(countryDTO107);
		collection.add(countryDTO108);
		collection.add(countryDTO109);
		collection.add(countryDTO110);
		collection.add(countryDTO111);
		collection.add(countryDTO112);
		collection.add(countryDTO113);
		collection.add(countryDTO114);
		collection.add(countryDTO115);
		collection.add(countryDTO116);
		collection.add(countryDTO117);
		collection.add(countryDTO118);
		collection.add(countryDTO119);
		collection.add(countryDTO120);
		collection.add(countryDTO121);
		collection.add(countryDTO122);
		collection.add(countryDTO123);
		collection.add(countryDTO124);
		collection.add(countryDTO125);
		collection.add(countryDTO126);
		collection.add(countryDTO127);
		collection.add(countryDTO128);
		collection.add(countryDTO129);
		collection.add(countryDTO130);
		collection.add(countryDTO131);
		collection.add(countryDTO132);
		collection.add(countryDTO133);
		collection.add(countryDTO134);
		collection.add(countryDTO135);
		collection.add(countryDTO136);
		collection.add(countryDTO137);
		collection.add(countryDTO138);
		collection.add(countryDTO139);
		collection.add(countryDTO140);
		collection.add(countryDTO141);
		collection.add(countryDTO142);
		collection.add(countryDTO143);
		collection.add(countryDTO144);
		collection.add(countryDTO145);
		collection.add(countryDTO146);
		collection.add(countryDTO147);
		collection.add(countryDTO148);
		collection.add(countryDTO149);
		collection.add(countryDTO150);
		collection.add(countryDTO151);
		collection.add(countryDTO152);
		collection.add(countryDTO153);
		collection.add(countryDTO154);
		collection.add(countryDTO155);
		collection.add(countryDTO156);
		collection.add(countryDTO157);
		collection.add(countryDTO158);
		collection.add(countryDTO159);
		collection.add(countryDTO160);
		collection.add(countryDTO161);
		collection.add(countryDTO162);
		collection.add(countryDTO163);
		collection.add(countryDTO164);
		collection.add(countryDTO165);
		collection.add(countryDTO166);
		collection.add(countryDTO167);
		collection.add(countryDTO168);
		collection.add(countryDTO169);
		collection.add(countryDTO170);
		collection.add(countryDTO171);
		collection.add(countryDTO172);
		collection.add(countryDTO173);
		collection.add(countryDTO174);
		collection.add(countryDTO175);
		collection.add(countryDTO176);
		collection.add(countryDTO177);
		collection.add(countryDTO178);
		collection.add(countryDTO179);
		collection.add(countryDTO180);
		collection.add(countryDTO181);
		collection.add(countryDTO182);
		collection.add(countryDTO183);
		collection.add(countryDTO184);
		collection.add(countryDTO185);
		collection.add(countryDTO186);
		collection.add(countryDTO187);
		collection.add(countryDTO188);
		collection.add(countryDTO189);
		collection.add(countryDTO190);
		collection.add(countryDTO191);
		collection.add(countryDTO192);
		collection.add(countryDTO193);
		collection.add(countryDTO194);
		collection.add(countryDTO195);
		System.out.println("array lrngth is :"+collection.size());
		Iterator<CountryDTO> country=collection.iterator();
		while(country.hasNext()) {
			
			CountryDTO countryDTO=country.next();
			System.out.println("info is:"+countryDTO);
			
			 
		}
		
		CountryDTO samplecontry=new CountryDTO(195,"Raichur","manvi",12000,2000,LocalDate.of(1947,7,18),5,"Hindu","Tiger","parrot","kabadi","yallu");
		boolean conta=collection.contains(samplecontry);//contanins is to chuck present r not 
		System.out.println("samplecontry info is present:"+conta);
		
		collection.add(samplecontry);
		boolean conta1=collection.contains(samplecontry);//
		System.out.println("samplecontry info is present:"+conta1);
		
		CountryDTO samplecontry1=new CountryDTO(195,"Raichur","manvi",12000,2000,LocalDate.of(1947,7,18),5,"Hindu","Tiger","parrot","kabadi","yallu");
    	boolean conta2=collection.contains(samplecontry1);
		System.out.println("samplecontry1 info is present:"+conta2);
		//iterate,foreach,stream,method loop;
		Iterator<CountryDTO> find=collection.iterator();
		System.out.println("insdie while...");
		
		while(find.hasNext()) {
			//System.out.println("insdie while...");
			CountryDTO findcountryDTO=find.next();
			if(findcountryDTO.getName().startsWith("I")){
			System.out.println("country name start with I:"+findcountryDTO.getName());
			}
		}
		
		Iterator<CountryDTO> find2=collection.iterator();
		System.out.println("inside 2nd whill..");
		while(find2.hasNext()) {
			//System.out.println(" inside 2nd while");
		   CountryDTO findend=find2.next();
		   //System.out.println("ends with a:"+findend.getName().endsWith("a"));  //-> it provide only true r false for all elements
		   if(findend.getName().endsWith("a")) {
			   System.out.println(" name ends with a:"+findend.getName());
		   }
		}
		
		Iterator<CountryDTO>  find3=collection.iterator();
		System.out.println("inside 3rd while ..");
		while(find3.hasNext()) {
			
			CountryDTO mid=find3.next();
			//System.out.println("items which contain middle words ai  is: "+mid.getName().contains("ai"));  //-> it provide only true r false for all elements
			if(mid.getName().contains("ai")) {
				System.out.println("items which contain middle words ai  is:"+mid.getName());
			}
		}

	System.out.println("####");
		// by using for loop iterater not required
		for(CountryDTO countryDTO:collection) {
			if(countryDTO.getName().endsWith("a")) {
				System.out.println("contry name ends with a:"+countryDTO.getName());
			}
		}
		
		System.out.println("%%%%%%");
		for(CountryDTO startcountryDTO:collection) {
			if(startcountryDTO.getName().startsWith("I")) {
				System.out.println("contry name starts with;"+startcountryDTO.getName());
			}
		}
		
		
		

		
	}
	

}


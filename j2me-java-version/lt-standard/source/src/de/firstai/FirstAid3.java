// Pirmoji.Pagalba.3.0.standard
/*
Ą \u0104
ą \u0105
			Ę \u0118
ę \u0119
Ė \u0116
ė \u0117
Į \u012E
į \u012F
			Ų \u0172
ų \u0173
Ū \u016A
ū \u016B

Č \u010C
č \u010D
Š \u0160
š \u0161
Ž \u017D
ž \u017E

 */

package de.firstai;

import java.io.IOException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

import de.enough.polish.ui.UiAccess;


public class FirstAid3 extends MIDlet implements CommandListener {

	boolean started = false;
	Form details;
	Display display;
	List menu;
	List telEmergency;

	// setup of the navigation buttons
	static final Command cmdBack = new Command("Atgal", Command.BACK, 2);
	static final Command cmdExit = new Command("I\u0161eiti", Command.EXIT, 2);

	StringItem aid_disclaimer, aid_general, aid_allergic, aid_asthma, aid_amputation, aid_apnoea, aid_checkbreathing, aid_eyeinjury, aid_chemicalburneyes, 
	aid_unconsciouswithbreath, aid_unconsciouswithoutbreath, aid_bleedinglight, aid_bleedingsevere, aid_diabeticcoma, aid_diarrhoea, aid_icerescue, aid_electricityaccident, aid_epilepsy, 
	aid_vomiting, aid_frostbitemild, aid_frostbitesevere, aid_suffocation, aid_drowning, aid_birth, aid_dangerzone, aid_brainconcussion, aid_resuscitation, aid_heartattack, aid_hyperthermia, 
	aid_insectstings, aid_fracture, aid_nosebleeding, aid_emergencycall, aid_backinjury, aid_skullfracture, aid_stroke, aid_snakebite, aid_shock, aid_sunburn, aid_sunstroke, 
	aid_sos, aid_recoveryposition, aid_animalbite, aid_safeguardaccident, aid_hypothermia, aid_hypoglycaemia, aid_chemicalburn, aid_burningslight, aid_burningsevere, aid_poisining, 
	aid_sprain, separator;

	StringItem[] stringItemArray;
	Image aid001, aid003, aid008, aid009, aid010, aid011, aid012, aid013, aid019, aid022;
	Image aid023, aid025, aid028, aid029, aid030, aid031, aid034, aid041, aid045, aid058;
	Image aid061, aid065, aid067, aid069, aid084, aid085, aid089, aid092, aid107;
	Image imageCC;

	StringItem stringAfrica;
	StringItem stringAsia;
	StringItem stringEurope;
	StringItem stringNorthamerica;
	StringItem stringOceania;
	StringItem stringSouthamerica;
	
	public FirstAid3() {

		this.menu = new List("Pirmoji Pagalba 3.0", Choice.IMPLICIT);
		this.menu.append("# Atsakomyb\u0117 + Nuorodos", null);
		this.menu.append("# Pagalbos telefonai", null);
		this.menu.append("# Bendros nuorodos", null);
		this.menu.append("Aki\u0173 nudegimas chemikalais", null);
		this.menu.append("Aki\u0173 su\u017Eeidimai", null);
		this.menu.append("Alergin\u0117s reakcijos", null);
		this.menu.append("Amputavimas", null);
		this.menu.append("Apsinuodijimas", null);
		this.menu.append("Astma / Kv\u0117pavimo sutrikimai", null);
		this.menu.append("Diabetin\u0117 koma", null);
		this.menu.append("Dirbtinis kv\u0117pavimas", null);
		this.menu.append("Dusulys", null);
		this.menu.append("Eismo nelaim\u0117", null);
		this.menu.append("Epilepsija", null);
		this.menu.append("Gaivinimas (Reanimacija)", null);
		this.menu.append("Gelb\u0117jimas", null);
		this.menu.append("Gimdymo pri\u0117mimas", null);
		this.menu.append("Greitosios pagalbos kvietimas", null);
		this.menu.append("Gyvat\u0117s \u012Fkandimas", null);
		this.menu.append("Gyv\u016Bn\u0173 \u012Fkandimai", null);
		this.menu.append("Hiperglikemija (cukraus kiekio padid\u0117jimas kraujyje)", null);
		this.menu.append("Hipoglikemija (cukraus kiekio suma\u017E\u0117jimas kraujyje)", null);
		this.menu.append("Insultas", null);
		this.menu.append("Kaukol\u0117s l\u016B\u017Eis", null);
		this.menu.append("Kaulo l\u016B\u017Eis", null);
		this.menu.append("Kraujavimas i\u0161 nosies", null);
		this.menu.append("Kraujavimas, lengvas", null);
		this.menu.append("Kraujavimas, stiprus", null);
		this.menu.append("Kr\u016Btin\u0117s l\u0105stos masa\u017Eas", null);
		this.menu.append("Kv\u0117pavimas sustoj\u0119s", null);
		this.menu.append("Kv\u0117pavimo kontroliavimas", null);
		this.menu.append("Nelaim\u0117s vieta, pa\u017Eym\u0117kite", null);
		this.menu.append("Nelaimingas atsitikimas ant ledo", null);
		this.menu.append("Nudegimas chemikalais", null);
		this.menu.append("Nudegimas saul\u0117je", null);
		this.menu.append("Nudegimas, lengvas", null);
		this.menu.append("Nudegimas, stiprus", null);
		this.menu.append("Nugaros su\u017Ealojimai", null);
		this.menu.append("Nu\u0161alimas, lengvas", null);
		this.menu.append("Nu\u0161alimas, sunkus", null);
		this.menu.append("Nutrenkimas elektros srove", null);
		this.menu.append("Perkaitimas", null);
		this.menu.append("Reanimacija", null);
		this.menu.append("S\u0105mon\u0117s netekimas (nukent\u0117j\u0119s nekv\u0117puoja)", null);
		this.menu.append("S\u0105mon\u0117s netekimas/ nualpimas (nukent\u0117j\u0119s kv\u0117puoja)", null);
		this.menu.append("Saul\u0117s sm\u016Bgis", null);
		this.menu.append("Sausgysl\u0117s patempimas, s\u0105nario i\u0161sukimas", null);
		this.menu.append("\u0160irdies infarktas", null);
		this.menu.append("Skendimas", null);
		this.menu.append("Smegen\u0173 sukr\u0117timas", null);
		this.menu.append("\u0160okas", null);
		this.menu.append("SOS - Nelaim\u0117s Signalas", null);
		this.menu.append("Stabili pozicija ant \u0161ono.", null);
		this.menu.append("Stuburo l\u016B\u017Eis", null);
		this.menu.append("Su\u0161alimas (Hipotermija)", null);
		this.menu.append("U\u017Edusimas", null);
		this.menu.append("U\u017Espringimas", null);
		this.menu.append("Vabzd\u017Ei\u0173 \u012Fkandimai", null);
		this.menu.append("V\u0117mimas", null);
		this.menu.append("Viduriavimas", null);
		this.menu.append("-------------", null); // 59
		this.menu.append("Skambinti 112", null); // 60

		// commands
		this.menu.addCommand(cmdExit);
		this.menu.setCommandListener(this);

		details = new Form ("First Aid on your Mobile");

		/**** Init the Images ****/
		try { aid001 = Image.createImage ("/aid001.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid003 = Image.createImage ("/aid003.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid008 = Image.createImage ("/aid008.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid009 = Image.createImage ("/aid009.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid010 = Image.createImage ("/aid010.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid011 = Image.createImage ("/aid011.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid012 = Image.createImage ("/aid012.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid013 = Image.createImage ("/aid013.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid019 = Image.createImage ("/aid019.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid022 = Image.createImage ("/aid022.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }

		try { aid023 = Image.createImage ("/aid023.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid025 = Image.createImage ("/aid025.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid028 = Image.createImage ("/aid028.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid029 = Image.createImage ("/aid029.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid030 = Image.createImage ("/aid030.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid031 = Image.createImage ("/aid031.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid034 = Image.createImage ("/aid034.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid041 = Image.createImage ("/aid041.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid045 = Image.createImage ("/aid045plug.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid058 = Image.createImage ("/aid058.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }

		try { aid061 = Image.createImage ("/aid061.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid065 = Image.createImage ("/aid065.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid067 = Image.createImage ("/aid067.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid069 = Image.createImage ("/aid069.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid084 = Image.createImage ("/aid084.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid085 = Image.createImage ("/aid085.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid089 = Image.createImage ("/aid089.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid092 = Image.createImage ("/aid092.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		try { aid107 = Image.createImage ("/aid107.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
		
		try { imageCC = Image.createImage ("/cc88x31.png"); } catch (IOException e1) { throw new RuntimeException ("Unable to load Image: "+e1); }
	}

	public void startApp() {
		if (!started) {
			// emergency numbers list
			telEmergency = new List ("\u017Demynai", Choice.IMPLICIT);
			telEmergency.append("Afrika", null);
			telEmergency.append("Azija", null);
			telEmergency.append("Europa", null);
			telEmergency.append("\u0160iaur\u0117s/Centrin\u0117-Amerika", null);
			telEmergency.append("Okeanija", null);
			telEmergency.append("Piet\u0173 Amerika", null);
			telEmergency.addCommand(cmdBack);
			telEmergency.setCommandListener(this);
			stringAfrica = new StringItem("- Afrika -", "\n# Al\u017Eyras\nPol:17 | Gyd:17 | Gais:14\n\n# Angola\nPol:110 | Gyd:118 | Gais:118\n\n# Beninas\nPol:17 | Gyd:301769 | Gais:18\n\n# Botsvana\nPol:999 | Gyd:997 | Gais:998\n\n# Burkina Fasas\nPol:17 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:18\n\n# Burundis\nPol:nera ry\u0161io | Gyd:nera ry\u0161io | Gais:nera ry\u0161io\n\n# Cadas\nPol:17 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:18\n\n# Centrin\u0117 Afrikos Respublika\nPol:611253 | Gyd:610600 | Gais:118\n\n# Dramblio Kaulo Krantas\nPol:110 | Gyd:110 | Gais:180\n\n# D\u017Eibutis\nPol:17 | Gyd:351351 | Gais:18\n\n# Egiptas\nPol:122 | Gyd:123 | Gais:180\n\n# Eritr\u0117ja\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Etiopija\nPol:91 | Gyd:92 | Gais:93\n\n# Gabonas\nPol:1730 | Gyd:1300 | Gais:18\n\n# Gambija\nPol:117 | Gyd:116 | Gais:118\n\n# Gana\nPol:191 | Gyd:193 | Gais:192\n\n# Gvin\u0117ja\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Gvin\u0117ja-Bisau\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Kamerunas\nPol:17 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:18\n\n# Kenija\nPol:999 | Gyd:999 | Gais:999\n\n# Komorai\nPol:tik radijo ry\u0161io telefonais | Gyd:tik radijo ry\u0161io telefonais | Gais:tik radijo ry\u0161io telefonais\n\n# Kongas (Kongo Demokratin\u0117 Respublika)\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Kongas (Kongo Respublika)\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Lesotas\nPol:123 | Gyd:121 | Gais:122\n\n# Liberija\nPol:911 | Gyd:911 | Gais:911\n\n# Libija\nPol:193 | Gyd:193 | Gais:193\n\n# Madagaskaras\nPol:117 | Gyd:2262566 | Gais:18\n\n# Majota\nPol:112 | Gyd:15 | Gais:603054\n\n# Malavis\nPol:199 | Gyd:199 | Gais:199\n\n# Malis\nPol:17 | Gyd:15 | Gais:18\n\n# Marokas\nPol:19 | Gyd:15 | Gais:15\n\n# Mauricijus\nPol:999 | Gyd:999 | Gais:999\n\n# Mauritanija\nPol:117 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:118\n\n# Mozambikas\nPol:119 | Gyd:117 | Gais:198\n\n# Namibija\nPol:1011 | Gyd:2032276 | Gais:2032270\n\n# Nigerija\nPol:119 | Gyd:199 | Gais:190\n\n# Nigeris\nPol:17 | Gyd:723141 | Gais:18\n\n# Piet\u0173 Afrika\nPol:10111 | Gyd:10177 | Gais:10111\n\n# Pusiaujo Gvin\u0117ja\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Reunionas\nPol:17 arba 112 mobilusis | Gyd:15 arba 112 mobilusis | Gais:18 arba 112 mobilusis\n\n# Ruanda\nPol:112 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Sacharos Arab\u0173 Demokratin\u0117 Respublika\nPol:-- | Gyd:-- | Gais:--\n\n# San Tome ir Prinsipe\nPol:-- | Gyd:-- | Gais:--\n\n# Sei\u0161eliai\nPol:999 | Gyd:999 | Gais:999\n\n# Senegalas\nPol:vietinio telefono ry\u0161io numeriais | Gyd:8891515 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Siera Leone\nPol:999 | Gyd:999 | Gais:999\n\n# Somalis\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Sudanas\nPol:999 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:999\n\n# Svazilandas\nPol:999 | Gyd:6060911 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Tanzanija\nPol:112 | Gyd:112 | Gais:112\n\n# Togas\nPol:101 | Gyd:191 | Gais:118\n\n# Tunisas\nPol:197 | Gyd:190 | Gais:198\n\n# Uganda\nPol:999 arba 111 mobilusis | Gyd:999 arba 111 mobilusis | Gais:999 arba 111 mobilusis\n\n# \u017Daliojo Ky\u0161ulio salos\nPol:132 | Gyd:130 | Gais:131\n\n# Zambija\nPol:999 arba 112 mobilusis | Gyd:991 arba 112 mobilusis | Gais:993 arba 112 mobilusis\n\n# Zimbabv\u0117\nPol:995 | Gyd:994 | Gais:993");
			stringAsia = new StringItem("- Azija -", "\n# Afganistanas\nPol:-- | Gyd:112 | Gais:--\n\n# Arm\u0117nija\nPol:102 | Gyd:103 | Gais:101\n\n# Azerbaid\u017Eanas\nPol:102 | Gyd:103 | Gais:101\n\n# Bahreinas\nPol:999 | Gyd:999 | Gais:999\n\n# Banglade\u0161as\nPol:8665513 | Gyd:199 | Gais:9555555\n\n# Brun\u0117jus\nPol:993 | Gyd:991 | Gais:995\n\n# Butanas\nPol:110 | Gyd:112 | Gais:113\n\n# Filipinai\nPol:117 | Gyd:117 | Gais:117\n\n# Gruzija\nPol:022 | Gyd:022 | Gais:022\n\n# Honkongas\nPol:999 | Gyd:999 | Gais:999\n\n# Indija\nPol:100 | Gyd:102 | Gais:101\n\n# Indonezija\nPol:110 | Gyd:118 | Gais:113\n\n# Irakas\nPol:nera ry\u0161io | Gyd:nera ry\u0161io | Gais:nera ry\u0161io\n\n# Iranas\nPol:110 arba 112 mobilusis  | Gyd:115 arba 112 mobilusis | Gais:125 arba 112 mobilusis\n\n# Izraelis\nPol:100 | Gyd:101 | Gais:102\n\n# Japonija\nPol:110 | Gyd:119 | Gais:119\n\n# Jemenas\nPol:199 | Gyd:199 | Gais:199\n\n# Jordanija\nPol:192 | Gyd:193 | Gais:193\n\n# Jungtiniai Arabu Emyratai\nPol:999 | Gyd:998 | Gais:997\n\n# Kambod\u017Ea\nPol:117 | Gyd:199 | Gais:118\n\n# Kataras\nPol:999 | Gyd:999 | Gais:999\n\n# Kazachstanas\nPol:03 | Gyd:03 | Gais:03\n\n# Kinija\nPol:110 | Gyd:120 | Gais:119\n\n# Kirgizija\nPol:133 | Gyd:03 | Gais:03\n\n# Kurdistanas\nPol:129 | Gyd:115 | Gais:125\n\n# Kuveitas\nPol:777 | Gyd:777 | Gais:777\n\n# Laosas\nPol:vietinio telefono ry\u0161io numeriais | Gyd:03 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Libanas\nPol:112 | Gyd:140 | Gais:175\n\n# Makao\nPol:999 | Gyd:999 | Gais:999\n\n# Malaizija\nPol:999 arba 112 mobilusis | Gyd:999 arba 112 mobilusis | Gais:999 arba 112 mobilusis\n\n# Maldyvai\nPol:119 | Gyd:102 | Gais:118\n\n# Mianmaras\nPol:199 | Gyd:199 | Gais:199\n\n# Mongolija\nPol:102 | Gyd:103 | Gais:101\n\n# Nepalas\nPol:100 | Gyd:228094 | Gais:101\n\n# Omanas\nPol:999 | Gyd:999 | Gais:999\n\n# Pakistanas\nPol:15 | Gyd:115 | Gais:16\n\n# Piet\u0173 Kor\u0117ja (Kor\u0117jos Respublika)\nPol:112 | Gyd:119 | Gais:119\n\n# Ryt\u0173 Timoras\nPol:112 | Gyd:7233212 | Gais:--\n\n# Saudo Arabija\nPol:999 | Gyd:997 | Gais:998\n\n# \u0160iaur\u0117s Kor\u0117ja\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Singapuras\nPol:999 | Gyd:995 | Gais:995\n\n# Sirija\nPol:112 | Gyd:110 | Gais:113\n\n# \u0160ri Lanka\nPol:119 arba 112 mobilusis | Gyd:110 | Gais:111\n\n# Tad\u017Eikistanas\nPol:02 | Gyd:03 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Tailandas\nPol:191 arba 1155 (turistams) | Gyd:191 | Gais:199\n\n# Taivanas\nPol:110 | Gyd:119 | Gais:119\n\n# Turkm\u0117nistanas\nPol:03 | Gyd:03 | Gais:03\n\n# Uzbekija\nPol:03 | Gyd:03 | Gais:03\n\n# Vietnamas\nPol:113 | Gyd:115 | Gais:114");
			stringEurope = new StringItem("- Europa -", "\n# Airija\nPol:112 | Gyd:112 | Gais:112\n\n# Albanija\nPol:19 | Gyd:17 | Gais:18\n\n# Andora\nPol:110 | Gyd:118 | Gais:118\n\n# Austrija\nPol:112 | Gyd:112 | Gais:112\n\n# Baltarusija\nPol:02 | Gyd:03 | Gais:01\n\n# Belgija\nPol:112 | Gyd:112 | Gais:112\n\n# Bosnija ir Hercegovina\nPol:122 | Gyd:124 | Gais:123\n\n# Bulgarija\nPol:112 | Gyd:112 | Gais:112\n\n# \u010Cekijos Respublika\nPol:112 | Gyd:112 | Gais:112\n\n# Danija\nPol:112 | Gyd:112 | Gais:112\n\n# Estija\nPol:112 | Gyd:112 | Gais:112\n\n# Graikija\nPol:112 | Gyd:112 | Gais:112\n\n# Islandija\nPol:112 | Gyd:112 | Gais:112\n\n# Ispanija\nPol:112 | Gyd:112 | Gais:112\n\n# Italija\nPol:112 | Gyd:112 | Gais:112\n\n# Jungtin\u0117 Karalyst\u0117\nPol:112 | Gyd:112 | Gais:112\n\n# Juodkalnija\nPol:112 | Gyd:112 | Gais:112\n\n# Kipras\nPol:112 | Gyd:112 | Gais:112\n\n# Kosovas\nPol:911 | Gyd:911 | Gais:911\n\n# Kroatija\nPol:92 | Gyd:94 | Gais:93\n\n# Latvija\nPol:112 | Gyd:112 | Gais:112\n\n# Lenkija\nPol:112 | Gyd:112 | Gais:112\n\n# Lichten\u0161teinas\nPol:112 | Gyd:112 | Gais:112\n\n# Lietuva\nPol:112 | Gyd:112 | Gais:112\n\n# Liuksemburgas\nPol:112 | Gyd:112 | Gais:112\n\n# Makedonija\nPol:112 | Gyd:112 | Gais:112\n\n# Malta\nPol:112 | Gyd:112 | Gais:112\n\n# Moldavija\nPol:902 | Gyd:903 | Gais:901\n\n# Monakas\nPol:112 | Gyd:112 | Gais:112\n\n# Norvegija\nPol:112 | Gyd:113 | Gais:110\n\n# Nyderlandai\nPol:112 | Gyd:112 | Gais:112\n\n# Portugalija\nPol:112 | Gyd:112 | Gais:112\n\n# Pranc\u016Bzija\nPol:17 arba 112 | Gyd:15 arba 112 | Gais:18 arba 112\n\n# Rumunija\nPol:112 | Gyd:112 | Gais:112\n\n# Rusija\nPol:02 | Gyd:03 | Gais:01\n\n# San Marinas\nPol:112 | Gyd:113 | Gais:116\n\n# Serbija\nPol:112 | Gyd:112 | Gais:112\n\n# Slovakija\nPol:112 | Gyd:112 | Gais:112\n\n# Slov\u0117nija\nPol:113 | Gyd:112 | Gais:112\n\n# Suomija\nPol:112 | Gyd:112 | Gais:112\n\n# \u0160vedija\nPol:112 | Gyd:112 | Gais:112\n\n# \u0160veicarija\nPol:117 arba 112 | Gyd: 144 arba 112 | Gais:118 arba 112\n\n# Turkija\nPol:155 | Gyd:112 | Gais:110\n\n# Ukraina\nPol:112 | Gyd:112 | Gais:112\n\n# Vatikanas\nPol:112 | Gyd:113 | Gais:115\n\n# Vengrija\nPol:112 | Gyd:112 | Gais:112\n\n# Vokietija\nPol:110 | Gyd:112 | Gais:112");
			stringNorthamerica = new StringItem("- \u0160iaur\u0117s/Centrin\u0117-Amerika -", "\n# Antigva ir Barbuda\nPol:911 | Gyd:911 | Gais:911\n\n# Bahamai\nPol:911 | Gyd:911 | Gais:911\n\n# Barbadosas\nPol:112 | Gyd:115 | Gais:113\n\n# Belizas\nPol:911 | Gyd:911 | Gais:911\n\n# Dominika\nPol:999 | Gyd:999 | Gais:999\n\n# Dominikos Respublika\nPol:911 | Gyd:911 | Gais:911\n\n# El Salvadoras\nPol:911 | Gyd:911 | Gais:911\n\n# Grenada\nPol:112 | Gyd:911 | Gais:911\n\n# Grenlandija\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Gvatemala\nPol:110 | Gyd:123 | Gais:122\n\n# Haitis\nPol:114 | Gyd:118 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Honduras\nPol:119 | Gyd:378654 | Gais:198\n\n# Jamaika\nPol:119 | Gyd:110 | Gais:110\n\n# Jungtin\u0117s Amerikos Valstijos\nPol:911 | Gyd:911 | Gais:911\n\n# Kaimanu salos\nPol:911 | Gyd:911 | Gais:911\n\n# Kanada\nPol:911 | Gyd:911 | Gais:911\n\n# Kosta Rika\nPol:911 | Gyd:911 | Gais:911\n\n# Kuba\nPol:26811 | Gyd:26811 | Gais:26811\n\n# Meksika\nPol:080 | Gyd:060 | Gais:060\n\n# Nikaragva\nPol:118 | Gyd:2651761 | Gais:2650162\n\n# Panama\nPol:104 | Gyd:2699778 | Gais:103\n\n# Sent Kitsas ir Nevis\nPol:911 | Gyd:911 | Gais:911\n\n# Sent Lusija\nPol:999 | Gyd:911 | Gais:911\n\n# Sent Pjeras ir Mikelonas\nPol:17 | Gyd:15 | Gais:18\n\n# Sent Vinsentas ir Grenadinai\nPol:911 | Gyd:911 | Gais:911\n\n# Trinidadas ir Tobagas\nPol:999 | Gyd:990 | Gais:990");
			stringOceania = new StringItem("- Okeanija -", "\n# Australija\nPol:000 arba 112 mobilusis | Gyd:000 arba 112 mobilusis | Gais:000 arba 112 mobilusis\n\n# Fid\u017Eis\nPol:911 | Gyd:911 | Gais:9170\n\n# Kiribatis\nPol:vietinio telefono ry\u0161io numeriais | Gyd:994 | Gais:vietinio telefono ry\u0161io numeriais\n\n# Mar\u0161alo salos\nPol:6258666 | Gyd:6254111  | Gais:vietinio telefono ry\u0161io numeriais\n\n# Mikronezija\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Naujoji Zelandija\nPol:111 | Gyd:111 | Gais:111\n\n# Nauru\nPol:vietinio telefono ry\u0161io numeriais | Gyd:vietinio telefono ry\u0161io numeriais | Gais:vietinio telefono ry\u0161io numeriais\n\n# Palau\nPol:911 | Gyd:911 | Gais:911\n\n# Papua ir Naujoji Gvineja\nPol:000 | Gyd:vietinio telefono ry\u0161io numeriais | Gais:110\n\n# Saliamono Salos\nPol:911 | Gyd:911 | Gais:911\n\n# Samoa\nPol:995 | Gyd:996 | Gais:994\n\n# Tonga\nPol:922 | Gyd:933 | Gais:999\n\n# Tuvalu\nPol:911 | Gyd:911 | Gais:911\n\n# Vanuatu\nPol:112 | Gyd:112 | Gais:112");
			stringSouthamerica = new StringItem("- Piet\u0173 Amerika -", "\n# Argentina\nPol:101 | Gyd:107 | Gais:100\n\n# Bolivija\nPol:911 | Gyd:911 | Gais:911\n\n# Brazilija\nPol:190 | Gyd:192 | Gais:193\n\n# \u010Cil\u0117\nPol:133 | Gyd:131 | Gais:132\n\n# Ekvadoras\nPol:101 | Gyd:131 | Gais:102\n\n# Gajana\nPol:911 | Gyd:913 | Gais:912\n\n# Kolumbija\nPol:119 | Gyd:119 | Gais:119\n\n# Paragvajus\nPol:911 | Gyd:911 | Gais:911\n\n# Peru\nPol:105 | Gyd:116 | Gais:116\n\n# Surinamas\nPol:115 | Gyd:115 | Gais:115\n\n# Urugvajus\nPol:911 | Gyd:911 | Gais:911\n\n# Venesuela\nPol:171 | Gyd:171 | Gais:171");

			// First-Aid-Text
			aid_disclaimer = new StringItem ("Atsakomyb\u0117 + Nuorodos", "1. Programin\u0117 \u012Franga\nPirmoji Medicinos Pagalba Mobiliajam Telefonui\nVersija: j3.0\nLeidiniai: 2008-12-24\nVisos teis\u0117s saugomos: Kai Kajus Noack\nVert\u0117ja: Alma Petru\u0161kevi\u010di\u016bt\u0117\nLicencija: Creative Commons by-nc-nd\n\nIliustracijos \u00A9 Med4Teens\n\n\u0160i programa teikia informacij\u0105 apie pirm\u0105j\u0105 medicinos pagalb\u0105. Ji neatstoja pirmosios pagalbos kurso, bet padeda atnaujinti jau \u012Fgytas \u017Einias.\n\n2. Atsakomyb\u0117s nebuvimas\nPra\u0161au atsi\u017Evelgti \u012F tai, jog u\u017E galimas vartojimo pasekmes neatsakau.\nNEPRISIIMU JOKIOS ATSAKOMYB\u0116S!\nVIS\u0104 RIZIK\u0104 PRISIIMA VARTOTOJAS!\n\nVisais nelaim\u0117s atvejais nedelsiant kreipkit\u0117s profesionalios pagalbos.\n\n3. Projekto rengimo\n\u0160i programa skirta tam, kad taptu daugiakalbe. Ie\u0161kome savanori\u0173 vert\u0117j\u0173!\n\nDaugiau informacijos galite rasti internete adresu www.firstai.de arba klauskite elektroniniu pa\u0161tu: info@firstai.de\n\nI\u0161gelb\u0117k vien\u0105 \u017Emog\u0173 ir Tu i\u0161gelb\u0117si \u017Emonij\u0105.");aid_general = new StringItem ("Bendros nuorodos", "1. Visuomet suteikite pirm\u0105j\u0105 medicinos pagalb\u0105. Nedarykite klaid\u0173.\n2. Saugokit\u0117s patys.\n3. Susidarykite ai\u0161k\u0173 vaizd\u0105 apie situacij\u0105 + pa\u017Eym\u0117kite nelaim\u0117s viet\u0105.\n4. I\u0161kvieskite greit\u0105j\u0105 pagalb\u0105 + Suteikite nukent\u0117jusiajam pirm\u0105j\u0105 medicinos pagalb\u0105.\n5. Esant keliems nukent\u0117jusiesiems pirmenyb\u0119 suteikite sunkiausiai su\u017Ealotam.\n6. Nuraminkite nukent\u0117jus\u012Fj\u012F. Stenkit\u0117s i\u0161likti ramus!\n7. Paguldykite susi\u017Ealojus\u012F kaip galima patogiau. Jokiu b\u016Bdu neduokite jam alkoholio, nikotino arba vaist\u0173.");aid_allergic = new StringItem ("Alergin\u0117s reakcijos", "1. I\u0161kviesti greit\u0105j\u0105 pagalb\u0105.\n2. Nuraminkite alergijos i\u0161tikt\u0105 \u017Emog\u0173 ir pasodinkite j\u012F patogiai.\n3. Pa\u0161alinkite alergijos suk\u0117l\u0117j\u0105 (pvz. vabzd\u017Eio geluon\u012F).\n4. \u0160aldykie alergin\u0117s reakcijos i\u0161tikta viet\u0105 (dr\u0117gnais kompresais, ledu).\n5. Jei \u017Emogus, i\u0161tiktas alergines reakcijos, turi prie\u0161alergini\u0173 vaist\u0173, duokite juos i\u0161gerti.\n6. Kontroliuokite alergijos i\u0161tiktojo b\u016Bkl\u0119, kol atvyks gydytojas.\n7. S\u0105mon\u0117s netekimo ar kv\u0117pavimo sutrikimo atvejais imkit\u0117s atitinkam\u0173 priemoni\u0173!");aid_animalbite = new StringItem ("Gyv\u016Bn\u0173 \u012Fkandimai", "D\u0117mesio: Galite u\u017Esikr\u0117sti stablige, pasiutlige.\n1. Nuplaukite \u017Eaizd\u0105 kar\u0161tu vandeniu su muilu.\n2. Dezinfekuokite \u017Eaizd\u0105.\n3. Sunkaus kraujavimo atveju, paguldykite nekent\u0117jus\u012F taip, kad vir\u0161utin\u0117 k\u016Bno dalis b\u016Bt\u0173 pakelta.\n4. Sutvarstykite steriliu tvars\u010Diu.\n5. Kreipkit\u0117s pas gydytoj\u0105 arba kvieskite greit\u0105j\u0105 pagalb\u0105.");aid_apnoea = new StringItem ("Kv\u0117pavimas sustoj\u0119s", "Negird\u0117ti kv\u0117pavimo, n\u0117ra kv\u0117pavimui b\u016Bding\u0173 judesi\u0173, pasikeitusi odos spalva.\n1. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n2. Paguldykite kv\u0117pavimo sutrikim\u0173 i\u0161tikt\u0105j\u012F ant nugaros.\n3. I\u0161 nukent\u0117jusiojo burnos ir gerkl\u0117s pa\u0161alinkite svetimk\u016Bnius. Atlo\u0161kite nukent\u0117jusiojo galv\u0105.\n4. Suspauskite nosies sparnelius taip, kad nosis b\u016Bt\u0173 u\u017Ekim\u0161ta.\n5. Giliai \u012Fkv\u0117pkite, priglauskite savo burn\u0105 prie nukent\u0117jusiojo burnos taip, kad visas J\u016Bs\u0173 i\u0161kv\u0117piamas oras patekt\u0173 \u012F nukent\u0117jusiojo plau\u010Dius.\n6. Giliai ir l\u0117tai i\u0161kv\u0117pkite.\n7. Jei nukent\u0117jusysis neatsigauna, t\u0119skite dirbtin\u012F kv\u0117pavim\u0105 i\u0161 burnos \u012F burn\u0105, kol atvyks gydytojas.");aid_asthma = new StringItem ("Astma / Kv\u0117pavimo sutrikimai", "\u016Am\u016Bs kv\u0117pavimo sutrikimai. \u0160vok\u0161\u010Diantis kv\u0117pavimas. Baim\u0117s jausmas.\n1. Nuraminkite i\u0161tikt\u0105 astmos priepuolio \u017Emog\u0173. Stenkit\u0117s i\u0161likti ramus!\n2. Atlaisvinkite jo drabu\u017Eius.\n3. I\u0161tikt\u0105j\u012F astmos priepolio pasodinkite patogiai, \u0161iek tiek palenkite \u012F priek\u012F, liepkite jam l\u0117tai ir giliai kv\u0117puoti.\n4. Jei astmos priepuolio i\u0161tiktasis turi inhaliatori\u0173, pad\u0117kite jam juo pasinaudoti. Po 5-10 min. tur\u0117t\u0173 pager\u0117ti.\n5. Jei nepager\u0117t\u0173, toliau naudokite inhaliatori\u0173 kas 5 minutes, kol atvyks gydytojas.\n6. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n7. Jei astmos priepuolio i\u0161tiktasis nustot\u0173 kv\u0117puoti, prad\u0117kite dirbtin\u012F kv\u0117pavim\u0105.");aid_backinjury = new StringItem ("Nugaros su\u017Ealojimai", "Skausmas nugaroje, nutirp\u0119 rankos ir kojos.\n1. Jokiu b\u016Bdu nejudinkite su\u017Ealotojo!\n2. Laikykite nukent\u0117jusiojo galv\u0105 taip, kad b\u016Bsena b\u016Bt\u0173 stabili.\n3. Stabilizuoti nukent\u0117jusiojo b\u016Bsen\u0105 paremiant i\u0161 \u0161on\u0173.\n4. Nusiraminkite nukent\u0117jus\u012Fj\u012F.\n5. Kvieskite greit\u0105j\u0105 pagalb\u0105, informuokite apie nugaros su\u017Eeidim\u0105.");aid_birth = new StringItem ("Gimdymo pri\u0117mimas", "I\u0161tek\u0117jo vaisiaus vandenys. Prasideda gimdymo skausmai. Netik\u0117tas gimdymas.\n1. I\u0161likite ram\u016Bs! - Kvieskite greit\u0105j\u0105 pagalb\u0105.\n2. Pasodinkite n\u0117\u0161\u010Di\u0105j\u0105 prask\u0117stomis apnuogintomis kojomis ant sterilaus pagrindo.\n3. Sulenkite kelius. \u0160iek tiek pakelkite jos duben\u012F. - Gimdymas yra nat\u016Bralus procesas ir da\u017Eniausiai praeina be komplikacij\u0173.\n4. Nuraminkite moter\u012F, leiskite jai sutelkti d\u0117mes\u012F \u012F kv\u0117pavim\u0105: \u012Ekv\u0117pti per nos\u012F, i\u0161kv\u0117pti per burn\u0105 (normaliu grei\u010Diu).\n5. St\u016Bmimo ritmas: Giliai \u012Fkv\u0117pti, sulaikyti kv\u0117pavim\u0105, stumti. Kai pasirodys k\u016Bdikio galvut\u0117, prilaikykite j\u0105 abiem rankomis.\n6. Po gimdymo: pakelkite k\u016Bdik\u012F nuo\u017Eulniai galva \u017Eemyn lengvai palenkta galvele, kad i\u0161 k\u016Bdikio kv\u0117pavimo tak\u0173 pasi\u0161alint\u0173 skystis. (Gali prireikti i\u0161 jo burnos ir nosyt\u0117s burnos pagalba issiurbti likus\u012F skyst\u012F). K\u016Bdikis turi kv\u0117puoti ir verkti!\n7. Suri\u0161kite bambagysl\u0119 30 cm atstumu nuo kudikio (tai gali b\u016Bti atlikta ligonin\u0117je). Steriliai apdenkite gimdyv\u0117s mak\u0161t\u012F.\n8. Nusausinkite k\u016Bdik\u012F ir laikykite j\u012F \u0161iltai. \u012Esid\u0117m\u0117kite laik\u0105 ir va\u017Eiuokite i ligonin\u0119.");aid_bleedinglight = new StringItem ("Kraujavimas, lengvas", "Tikslas: Kraujavimo sustabdymas.\n1. \u017Daizdos nelieskite (d\u0117l infekcijos pavojaus).\n2. \u017Daizdos niekuo netepkite, nepurk\u0161kite ir nepudruokite.\n3. Ant \u017Eaizdos u\u017Ed\u0117kite steril\u0173 tvarst\u012F ir j\u012F u\u017Eklijuokite pleistru ar bintu apri\u0161kite su\u017Eeist\u0105 viet\u0105.\n4. Esant silpnam kraujavimui u\u017Etenka tik paprasto pleistro.\n5. Didesnei \u017Eaizdai naudokite steril\u0173 tvarst\u012F. Ji u\u017Ed\u0117kite ant \u017Eaizdos ir apri\u0161kite bintu (ver\u017Ekite ne per stipriai, nes tai gali sukelti dar didesn\u012F kraujavim\u0105).\n6. \u012Ekandus pasiutusiam gyv\u016Bnui \u017Eaizd\u0105 nuplaukite vandeniu ir muilu.");aid_bleedingsevere = new StringItem ("Kraujavimas, stiprus", "Kraujas liejasi i\u0161 \u017Eaizdos pulsuodamas, purk\u0161damas. Pavojus, kad i\u0161tiks \u0161okas d\u0117l kraujo netekimo, infekcija, \u017Emogus gali mirti. Tikslas: kraujavimo sustabdymas.\n1. Pa\u0161alinkite drabu\u017Eius (esant b\u016Btinybei juos prakirpkite), apnuoginkite su\u017Ealot\u0105 viet\u0105.\n2. Bintu arba drabu\u017Eio skiaute apvyniokite \u017Eaizd\u0105 j\u0105 u\u017Espaud\u017Eiant.\n3. U\u017Ever\u017Et\u0105 \u017Eaizd\u0105 laikykite ma\u017Eiausiai 10 minu\u010Di\u0173.\n4. Jei naudojamas var\u017Etas persisunk\u0117 krauju, jo nepa\u0161alinkite! Ant vir\u0161aus d\u0117kite kit\u0105 bint\u0105 ar drabu\u017Eio skiaut\u0119.\n5. Su\u017Eeist\u0105 gal\u016Bn\u0119, jei ji nel\u016B\u017Eus, pakelkite auk\u0161\u010Diau \u0161irdies lygmens, kad kraujavimas susilpn\u0117t\u0173. Jei yra galimyb\u0117, su\u017Eeist\u0105j\u012F paguldykite.\n6. Jei kraujavimo nepavyksta sustabdyti, \u017Eaizd\u0105 laikykite u\u017Espaud\u0119 toliau, tuo pa\u010Diu ver\u017Ekite vir\u0161 su\u017Eeistos vietos: kraujuojant dilbiui- \u017East\u0105 (pir\u0161tais spauskite per vidu\u012Fi i\u0161 vidin\u0117s rankos pus\u0117s tarp alk\u016Bn\u0117s ir pa\u017Easties); kraujuojant kojai - u\u017Espauskite ranka kirk\u0161n\u012F (spauskite kraujagysles kirk\u0161nyje, kur arterija eina per dubens kaulus).\n7. Nedelsiant kvieskite greit\u0105j\u0105 pagalb\u0105.\n8. Jeigu kraujavimas sustojo, imkit\u0117s pirmosios pagalbos priemoni\u0173 \u0161okui pa\u0161alinti.");aid_brainconcussion = new StringItem ("Smegen\u0173 sukr\u0117timas", "Galvos skausmas, pykinimas, v\u0117mimas. Pablog\u0117j\u0119s reg\u0117jimas. Galimas s\u0105mon\u012Fs netekimas.\n1. Nukent\u0117jus\u012Fj\u012F paguldykite.\n2. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n\nJeigu galva kraujuoja:\n1. Paguldykite nukent\u0117jus\u012Fj\u012F, pakelkite galv\u0105 (ant pagalv\u0117s).\n2. Apri\u0161kite \u017Eaizd\u0105 (naudokite tvarst\u012F).\n3. Kvieskite greit\u0105j\u0105 pagalb\u0105.");aid_burningslight = new StringItem ("Nudegimas, lengvas", "Odos paraudimas. Lengvas patinimas. Skausmas.\n1. \u0160aldykite su\u017Eeist\u0105 viet\u0105 po \u0161altu tekan\u010Diu vandeniu.\n2. Never\u017Eiant aptvarstykite dr\u0117gnu tvars\u010Diu.");aid_burningsevere = new StringItem ("Nudegimas, stiprus", "P\u016Bsl\u0117ti baltai raudoni odos plotai. \u0160lapiuojanti oda. Giluminis audini\u0173 pa\u017Eeidimas. Stiprus skausmas arba skausmo n\u0117ra (d\u0117l sudegusi\u0173 nerv\u0173).\n1. Pa\u0161alikite kiek \u012Fmanoma drabu\u017Eius.\n2. \u0160aldykite nudegusias k\u016Bno dalis \u0161altu vandeniu (ma\u017Edaug 15 \u00B0C) iki 10 min, kol skausmas atsl\u016Bgs.\n3. Jei nudeginimas platus, \u0161aldykite dr\u0117gnais rank\u0161luo\u0161\u010Diais.\n4. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n5. Po to kai at\u0161ald\u0117te \u017Eaizd\u0105, j\u0105 sutvarstykite. Naudokite steril\u0173 saus\u0105 tvarst\u012F. Nenaudokite joki\u0173 skys\u010Di\u0173 (krem\u0173, aliej\u0173, tepa\u0173i ir kt.) Nepradurkite susidariusi\u0173 p\u016Bsli\u0173.\n6. Kontroliuokite nukent\u0117jusiojo kv\u0117pavim\u0105 ir s\u0105mon\u0119 kol atvyks gydytojas.");aid_checkbreathing = new StringItem ("Kv\u0117pavimo kontroliavimas", "1. Patikrinkite kv\u0117pavimo gars\u0105.\n2. Kr\u016Btin\u0117s l\u0105stos jud\u0117jimas (tikrinti ant pilvo u\u017Ededant rank\u0105).\n3. Patikrinti ar jau\u010Diamas kv\u0117pavim\u0105 per nos\u012F ar burn\u0105.");aid_chemicalburneyes = new StringItem ("Aki\u0173 nudegimas chemikalais", "1. Kvieskite greit\u0105j\u0105 pagalb\u0105, informuokite apie chemin\u0119 med\u017Eiag\u0105, nudeginusi\u0105 ak\u012F.\n2. Plaukite ak\u012F vandeniu. Plaunant u\u017Edenkite sveik\u0105 ak\u012F.\n3. Su\u017Eeist\u0105 ak\u012F plaukite \u0161alto vandens srove apie 20 min. nuo vidinio akies kra\u0161to link i\u0161orinio.\n4. U\u017Emerkite abi akis ir u\u017Eri\u0161kite dr\u0117gnu tvars\u010Diu.\n5. Steb\u0117kite nukent\u0117jusiojo b\u016Bsen\u0105 kol atvyks greitoji medicinos pagalba.");aid_chemicalburn = new StringItem ("Nudegimas chemikalais", "Audini\u0173 su\u017Ealojimas.\n1. Saugokit\u0117s patys!\n2. Nedelsiant nuplaukite nudegint\u0105 viet\u0105 (nudegusi\u0105 ak\u012F plauti \u0161altu vandeniu ma\u017E. 20 min., vandens srov\u0119 kreipti nuo vidinio link i\u0161orinio akies kra\u0161to).\n3. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n4. Cheminis vir\u0161kinamojo trakto nudegimas. Gerti daug vandens.\n5. Neprovokuoti v\u0117mimo!");aid_dangerzone = new StringItem ("Gelb\u0117jimas", "1. B\u016Bdas: atsistokite u\u017E nukent\u0117jusiojo, nukent\u0117jusiojo ranka ant jo kr\u016Btin\u0117s.\n2. Apkabinkite nukent\u0117jus\u012Fj\u012F pro pa\u017Eastis ir paimkite u\u017E sulenktos nukent\u0117jusiojo rankos.\n3. Gabenkite nukent\u0117jus\u012Fj\u012F \u012F saugi\u0105 viet\u0105.");aid_diabeticcoma = new StringItem ("Diabetin\u0117 koma", "Cukraus koncentracija kraujyje per didel\u0117 (atitinkamai tr\u016Bksta insulino).\nPo\u017Eymiai: tro\u0161kulys, da\u017Enas \u0161lapinimasis, pykinimas, v\u0117mimasi. Kv\u0117pavimas atsiduoda vaisiais.\n1. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n2. Jeigu ai\u0161ku, kad \u017Emogus diabetikas, pad\u0117kite susileisti insulino.\n3. Paguldykite nukent\u0117jus\u012Fj\u012F stabiliai ant \u0161ono. Daugiau pirmos pagalbos teik\u0117jas negali tokiu atveju padaryti.\n4. Steb\u0117ti b\u016Bkl\u0119, kol atvyks gydytojas.");aid_diarrhoea = new StringItem ("Viduriavimas", "Apsinuodijimas maistu, infekcijos arba \u017Earnyno liga. Viduriavimas skystas, gleiv\u0117tas arba su krauju.\n1. Pavojus d\u0117l dehidratacijos ir mineral\u0173 tr\u016Bkumo!\n2. Duoti gerti skys\u010Di\u0173 (arbatos, vandens).\n3. Sunkiais atvejais vykti pas gydytoj\u0105 arba kvieti greit\u0105j\u0105 pagalb\u0105.");aid_drowning = new StringItem ("Skendimas", "1. Kvieskite greit\u0105j\u0105 pagalb\u0105. Pra\u0161ykite aplinkini\u0173 \u017Emoni\u0173 pagalbos.\n2. Gelbekite sk\u0119stant\u012Fj\u012F!\n3. Jeigu nukent\u0117jus\u012Fsis kv\u0117puoja: Paguldykite \u012F stabili\u0105 pozicij\u0105 ant \u0161ono. Apklokite (antklode). Steb\u0117kite b\u016Bkle, kol atvyks greitoji pagalba.\n4. Jeigu nukent\u0117jus\u012Fsis nekv\u0117puoja: Nedelsiant prad\u0117kite gaivinim\u0105! (Nesistenkinte pa\u0161alinti vandens i\u0161 plau\u010Diu.)");aid_electricityaccident = new StringItem ("Nutrenkimas elektros srove", "1. Visu pirma nutraukite elektros energijos tiekim\u0105!\nGalimas s\u0105mon\u0117s netekimas kv\u0117pavimo sustojimas.\n2. A - S\u0105mon\u0117s netekimas,kv\u0117pavimas nesutrik\u0119s\n3. B - S\u0105mon\u0117s netekimas, kv\u0117pavimo n\u0117ra");aid_emergencycall = new StringItem ("Greitosios pagalbos kvietimas", "1. Paskambinkite pirmu pasitaikiusiu telefonu 112 (JAV: 911). Visada galima ir nemokamai! Nedvejokite ir kvieskite greit\u0105j\u0105 pagalb\u0105! Telefonu privalote suteikti \u0161i\u0105 informacij\u0105: Kas nutiko - Kur (nelaimingo atsitikimo vieta) - Kiek nukent\u0117jusi\u0173j\u0173 - Kokios traumos. Laukite tolimesni\u0173 nurodymu.");aid_epilepsy = new StringItem ("Epilepsija", "Susting\u0119s k\u016Bnas, sugniau\u017Eti kum\u0161\u010Diai, suk\u0105stas \u017Eandikaulis, tr\u016Bk\u010Diojan\u010Dios gal\u016Bn\u0117s arba veidas. Besivartan\u010Dios akys. Seil\u0117jimasis. Galimas s\u0105mon\u0117s netekimas.\n1. Nelaikykite nukent\u0117jusiojo, neribokite jo judesi\u0173.\n2. Paguldykite nukent\u0117jus\u012Fj\u012F ant mink\u0161to pagrindo (pagalv\u0117s), pa\u0161alinkite arti esancius daiktus siekiant u\u017Ekirsti keli\u0105 susi\u017Ealojimams.\n3. Raminkite nukent\u0117jus\u012Fj\u012F \u017Eod\u017Eiais. Atlaisvinkite drabu\u017Eius, kad jis gal\u0117t\u0173 laisvai kv\u0117puoti.\n4. Jeigu nukent\u0117j\u0119s vemia, pakreipkite jo galv\u0105 taip, kad neu\u017Espringt\u0173.\n5. Steb\u0117kite, kad kv\u0117pavimo takai b\u016Bt\u0173 laisvi. Nukent\u0117j\u0119s gali nuryti lie\u017Euv\u012F.\n6. Paguldykite stabiliai ant \u0161ono + kvieskite greit\u0105j\u0105 pagalb\u0105. Steb\u0117kite nukent\u0117jusiojo b\u016Bkl\u0119.\n7. Neleiskite prisiartinti kitiems \u017Emon\u0117ms.");aid_eyeinjury = new StringItem ("Aki\u0173 su\u017Eeidimai", "1. Svetimk\u016Bn\u012F palikite akyje, nesistenkite jo pa\u0161alinti.\n2. Akies nejudinkite ir nelieskite, tam kad jos dar daugiau nesu\u017Eeistum\u0117te.\n3. Jeigu akis kraujuoja, u\u017Ed\u0117kite ant jos kompres\u0105 arba steril\u0173 tvarst\u012F.\n4. Ak\u012F \u0161aldykite \u0161altu kompresu, tai ma\u017Eina tinim\u0105, stabdo kraujavim\u0105.\n5. Kvieskite greit\u0105j\u0105 pagalb\u0105 arba va\u017Eiuokite \u012F ligonin\u0119.");aid_fracture = new StringItem ("Kaulo l\u016B\u017Eis", "Simptomai: nenat\u016Brali pozicija, nenat\u016Bralus kaul\u0173 jud\u0117jimas. Deformacija. Skausmingas jud\u0117jimas, skausmas prisilietus.\n1. Vengti judesi\u0173!\n2. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n3. U\u017Ed\u0117kite \u012Ftvar\u0105 sulau\u017Eytam kaului, paremkite nekei\u010Diant kaulo pozicijos.\n4. Jei l\u016B\u017Eis atviras, steriliai pridenkite \u017Eaizd\u0105.");aid_frostbitemild = new StringItem ("Nu\u0161alimas, lengvas", "Bly\u0161kumas, patinimas. Gali sutrikti apr\u016Bpinimas krauju.\n1. Nuveskite nukent\u0117jus\u012Fj\u012F \u012F \u0161ilum\u0105.\n2. Pasistenkite nukent\u0117jus\u012Fj\u012F su\u0161ildyti, pa\u0161alinkite \u0161lapius drabu\u017Eius.\n3. Su\u0161ildykite drungnu vandeniu ir savo k\u016Bno \u0161iluma.\n4. Duokite \u0161ilto g\u0117rimo (arbatos). Jokio alkoholio!");aid_frostbitesevere = new StringItem ("Nu\u0161alimas, sunkus", "\u0160alta ir kieta k\u016Bno oda, pilkai balta spalva, darosi p\u016Bsl\u0117s, audiniai apmir\u0161ta. Gali sutrikti apr\u016Bpinimas krauju!\n1. Eikite \u012F \u0161ilt\u0105 viet\u0105.\n2. \u017Daizdas sutvarstykite/apdenkite.\n3. Duokite cukrumi saldinto g\u0117rimo.\n4. Nesistenkite su\u0161ildyti trynimu!\n5. Kvieskite greit\u0105j\u0105 pagalb\u0105.");aid_heartattack = new StringItem ("\u0160irdies infarktas", "Sunkus, daugiau kaip 5 min. trunkantis spaudimas ir skausmas kr\u016Btin\u0117je, ypatingai besiskleidi\u017Eantis rankos bei paties srityje. Nerimas, bly\u0161kumas, \u0161altas prakaitas. Galimas pykinimas, dusulys.\n1. Kvieskite greit\u0105j\u0105 pagalb\u0105! Prane\u0161kite apie galim\u0105 \u0161irdies infarkt\u0105.\n2. Vir\u0161utin\u0119 k\u016Bno dal\u012F pakelkite. Atpalaiduokite drabu\u017Eius. Neduokite vaist\u0173 ar g\u0117rim\u0173.\n3. Raminkite nukent\u0117jus\u012Fj\u012F \u017Eod\u017Eiais.\n4. Kontroliuokite s\u0105mon\u0119 ir kv\u0117pavim\u0105.\n5. Jeigu turite, duokite aspirino.\n6. Jei asmuo praranda s\u0105mon\u0119, prad\u0117kite gaivinim\u0105.");aid_hypoglycaemia = new StringItem ("Hipoglikemija (cukraus kiekio suma\u017E\u0117jimas kraujyje)", "Cukraus koncentracija kraujyje yra ma\u017Eesne nei ma\u017Eiausia vert\u0117 (perdozavus insulino arba d\u0117l nepakankamo maitinimosi).\nSimptomai: bly\u0161kumas, nervingumas, alkis, drebulys, prakaitas.\n1. \u012Esitikinkite, kad asmuo yra diabetikas (diabetiko \u017Eenklelis).\n2. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n3. Duokite cukrumi saldinto g\u0117rimo arba dekstroz\u0117s / gliukoz\u0117s (jei n\u0117ra rijimo problem\u0173).\n4. Jei asmuo be s\u0105mon\u0117s, bet kv\u0117puoja: paguldykite stabiliai ant \u0161ono ir steb\u0117kite kv\u0117pavim\u0105. Jei kv\u0117pavimas sustojo, darykite dirbtin\u012F kv\u0117pavim\u0105.\n5. Jei nukent\u0117jus\u012Fsis kv\u0117puoja, bet be s\u0105mon\u0117s, \u012Fd\u0117kite gabaliuk\u0105 cukraus u\u017E \u017Eando ir paspauskite i\u0161 i\u0161or\u0117s.");aid_hyperthermia = new StringItem ("Perkaitimas", "Tro\u0161kulys, silpnumas, orientacijos sutrikimas, pykinimas, sumi\u0161imas, stiprus prakaitavimas, kar\u0161\u010Diuojanti oda.\n1. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n2. V\u0117sinti, ie\u0161koti pav\u0117sio (patalpa su oro kondicionieriumi pageidautina).\n3. Asmen\u012F paguldyti, pakelti kojas. Atlaisvinti drabu\u017Eius.\n4. Od\u0105 v\u0117sinti vandeniu arba u\u017Ed\u0117ti \u0161alt\u0105 rank\u0161luost\u012F.\n5. Gerti daug vandens ar sulciui.");aid_hypothermia = new StringItem ("Su\u0161alimas (Hipotermija)", "\u0160altas drebulys, mieguistumas, i\u0161sekimas net iki s\u0105mon\u0117s netekimo. \u0160alta, bly\u0161ki oda. \u017Demas pulsas, silpnas \u0161irdies plakimas.\n1. Eiti \u012F \u0161ilt\u0105 patalp\u0105.\n2. Kviesti greit\u0105j\u0105 pagalb\u0105.\n3. Pa\u0161alinti \u0161al\u010Dio \u0161altin\u012F.. Didinti k\u016Bno temperat\u016Br\u0105 (dekio arba savo k\u016Bno kontaktu).\n4. Nurenkite \u0161lapius drabu\u017Eius ir aprengite \u0161iltais drabu\u017Eiais. Apsupkite dekiu. U\u017Edenkite galv\u0105.\n5. Duokite atsigerti kar\u0161tos arbatos, sriubos arba kar\u0161to vandens. Jokio alkoholio! Neleiskite asmeniui u\u017Emigti.\n6. Steb\u0117kite su\u0161alusiojo b\u016Bkl\u0119, kol atvyks greitoji pagalba. Jei asmuo netenka s\u0105mon\u0117s, prad\u0117kite gaivinim\u0105:\n7. A - Nukent\u0117j\u0119s be s\u0105mon\u0117s, bet kv\u0117puoja\n8. B - Be s\u0105mon\u0117s, nekv\u0117puoja");aid_icerescue = new StringItem ("Nelaimingas atsitikimas ant ledo", "Saugokit\u0117s patys. Pavojus nusk\u0119sti, nu\u0161alimas.\n1. Gelb\u0117kite kop\u0117\u010Di\u0173, lentos ar lazdos pagalba. Svoris ant ledo turi b\u016Bti tolygiai paskirstytas.\n2. Papra\u0161ykite kit\u0173 \u017Emoni\u0173 pagalbos. Pra\u0161ykite i\u0161kviesti greit\u0105j\u0105 pagalb\u0105.\n3. Su \u012Frankiu rankoje, atsargiai \u0161liau\u017Ekite ant pilvo (jei \u012Fmanoma, prisiri\u0161us virve) link \u012Fskilusio ledo.\n4. Paduokite nukent\u0117jusiam \u012Frank\u012F (ne savo rank\u0105!) ir traukite.\n5. \u0160liau\u017Ekite atgal link kranto.\n6. Suteikite Pirm\u0105j\u0105 medicinos pagalb\u0105.\n7. Savaranki\u0161kas gelb\u0117jimasis: Jei ledas kietos, paskirstykite svor\u012F tolygiai ir stenkit\u0117s i\u0161lipti.Ant pilvo \u0161liau\u017Ekite link kranto. Jei ledas trapus, pabandykite sulau\u017Eyti led\u0105 iki kra\u0161to.");aid_insectstings = new StringItem ("Vabzd\u017Ei\u0173 \u012Fkandimai", "Patinimas, odos b\u0117rimas, deginimas, silpnumas, pasunkej\u0119s kv\u0117pavimas, svaigimas, tachikardija.\n1. Atsargiai pa\u0161alinkite geluon\u012F (su pincetu). Nespauskite geluonies, nes taip galite \u012F\u0161virk\u0161ti daugiau nuod\u0173.\n2. At\u0161aldykite su\u017Eeist\u0105 viet\u0105 (u\u017Ed\u0117kite \u0161alt\u0105 kompres\u0105).\n3. \u012Egelt\u0105 viet\u0105 laikykite \u017Eemiau nei \u0161irdis, taip cirkuliuos nuodai l\u0117\u010Diau.\n4. Jeigu geluonis yra burnos ertm\u0117je: \u010Diulpti ledus ir u\u017Ed\u0117kite \u0161alt\u0105 kompres\u0105 aplink gerkl\u0119.\n5. Pasirei\u0161kus sunkioms problemoms i\u0161kviesti greit\u0105j\u0105 pagalb\u0105.");aid_nosebleeding = new StringItem ("Kraujavimas i\u0161 nosies", "\u012Etr\u016Bkusi kraujagysl\u0117 nosies ertm\u0117je.\n1. Pasodinkite kraujuojant\u012F asmen\u012F ir truput\u012F palenkite \u012F prieki. Laikykite galv\u0105 tiesiai.\n2. Neguldykite asmens, galvos pad\u0117tis vir\u0161 \u0161irdies l\u0117tina kraujavim\u0105.\n3. U\u017Ed\u0117kite \u0161alt\u0105 kompres\u0105 ant sprando.\n4. U\u017Espauskite nos\u012F kol kraujavimas sustos (apie 10 min.)\n5. V\u0117liau nevarginkite nosies (ne \u0161nyp\u0161kite).\n6. Jeigu problema rimta arba kraujavimas ilgai nenustoja, kvieskite gydytoj\u0105.");aid_poisining = new StringItem ("Apsinuodijimas", "Sumi\u0161imas, haliucinacijos, issipl\u0117t\u0119 vyzd\u017Eiai, kar\u0161\u010Diavimas, me\u0161lungis, s\u0105mon\u0117s netekimas.\n1. Duokite prie\u0161nuod\u017Ei\u0173 tik tada jeigu \u0161alia kvalifikuotas medikas.\n2. Neduokite gerti. Neprovokuokite v\u0117mimo.\n3. I\u0161kvieskite greit\u0105j\u0105 pagalb\u0105, b\u016Btinai nurodykite, kad asmuo apsinuodij\u0119s!\n4. I\u0161saugokite nuod\u0173 ir v\u0117mimo liku\u010Dius!\n5. Jeigu nukent\u0117j\u0119s be s\u0105mon\u0117s, bet kv\u0117puoja: paguldykite stabiliai ant \u0161ono. Steb\u0117kite s\u0105mon\u0119 ir kv\u0117pavim\u0105 kol atvyks gydytojas.\n6. Jeigu nukent\u0117jusysis nekv\u0117puoja: Nedelsiant prad\u0117kite gaivinim\u0105! Prie\u0161 pradedant dirbtin\u012F kv\u0117pavim\u0105, patikrinkite, ar neu\u017Esikim\u0161\u0119 kv\u0117pavimo takai, pavyzd\u017Eiui d\u0117l v\u0117mimo.");aid_recoveryposition = new StringItem ("Stabili pozicija ant \u0161ono.", "1. Paguldykite nukent\u0117jus\u012Fj\u012F ant nugaros, i\u0161tieskite kojas. Atsiklaupkite \u0161alia.\n2. Ar\u010Diausiai j\u016Bs\u0173 esan\u010Di\u0105 nekent\u0117jusiojo rank\u0105 pad\u0117kite sta\u010Diu kampu prie k\u016Bno.\n3. Tolimesni\u0105j\u0105 rank\u0105 u\u017Ed\u0117kite ant kr\u016Btin\u0117s, o delno i\u0161orin\u0119 pus\u0119 ant skruosto.\n4.Paimkite tolimesn\u012F kel\u012F, patraukite link sav\u0119s ir pad\u0117kite ant \u017Eem\u0117s. Koja turi gul\u0117ti sta\u010Diu kampu. Ranka nukent\u0117jusiojo ant skruoto.\n5. \u012Esitikinkite, kad kv\u0117pavimo takai n\u0117ra blokuojami.\n6. Atlo\u0161kite galv\u0105, kilstel\u0117kite smakr\u0105. Lengvai pra\u017Eiodinkite burn\u0105. Steb\u0117kite kv\u0117pavim\u0105.\n7. Steb\u0117kite nukent\u0117jusiojo b\u016Bkl\u0119 kol atvyks greitoji pagalba.");aid_resuscitation = new StringItem ("Gaivinimas (Reanimacija)", "# I\u0161orinis \u0161irdies masa\u017Eas\n1. Nukent\u0117jus\u012Fj\u012F paguldykite ir atsiklaupkite \u0161alia jo.\n2. Atsekite kr\u016Btin\u0117s dalies drabu\u017Eius.\n3. U\u017Ed\u0117kite savo vien\u0105 deln\u0105 ant apatin\u0117s kr\u016Btinkaulio dalies.\n4. Kit\u0105 deln\u0105 u\u017Ed\u0117kite ant jo.\n5. I\u0161tieskite rankas ir alk\u016Bnes.\n6. Statmenai i\u0161 vir\u0161aus nelenkdami alk\u016Bni\u0173 stipriai paspauskite kr\u016Btinkaul\u012F apie 5 cm ir atleiskite.\n7. Trumpai ir stipriai kartokite \u0161\u012F judes\u012F i\u0161 eil\u0117s 30 kart\u0173!\n\n# Dirbtinis kv\u0117pavimas\n1. Pa\u0161alinkite visus svetimk\u016Bnius, esancius nukent\u0117jusiojo burnoje (protezus, v\u0117mal\u0173 liku\u010Dius ir kt.). Atlo\u0161kite nukent\u0117jusiojo galv\u0105 prilaikydami kakl\u0105.\n2. Laisva ranka u\u017Espauskite nos\u012F.\n3. Giliai \u012Fkv\u0117pkite ir \u012Fp\u016Bskite or\u0105 nukent\u0117jusiam \u012F burn\u0105 taip, kad oras negal\u0117t\u0173 i\u0161eiti.\n4. \u012Ep\u016Btim\u0105 i\u0161 burnos \u012F burn\u0105 kartokite du kartus (l\u0117tai, pilnai i\u0161kvepiant).\n5. V\u0117l darykite i\u0161orin\u012F \u0161irdies masa\u017E\u0105.\n\nI\u0161orinis \u0161irdies masa\u017Eas kartu su dirbtiniu kv\u0117pavimu atliekamas tol kol atva\u017Eiuos greitoji pagalba.");aid_safeguardaccident = new StringItem ("Nelaim\u0117s vieta, pa\u017Eym\u0117kite", "1. Savo automobil\u012F pastatykite 50-100 m u\u017E eismo ivykio vietos (jeigu \u012Fvykis greitkelyje arba plente). \u012Ejunkite avarin\u012F signal\u0105. Apsirenkite matomumo liemen\u0119.\n2. \u012Evykio vietoje pastatykite avarin\u012F \u017Eenkl\u0105. D\u0117mesio: Jei avarija pos\u016Bkyje, pastatykite avarin\u012F \u017Eenkl\u0105 prie\u0161 pos\u016Bk\u012F!\n3. Pa\u0161aukite aplinkinius \u017Emones \u012F pagalb\u0105.\n4. Atidarykite automobilio duris (jei u\u017Estrig\u0119, naudokite automobilio keltuv\u0105). I\u0161junkite degim\u0105.\n5. Gelb\u0117kite avarijos auk\u0105 : atsekite saugos dir\u017E\u0105, atstumkite s\u0117dyn\u0119. I\u0161kelkite su\u017Eeist\u0105j\u012F apkabin\u0119 per pa\u017Eastis.\n6. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n7. Suteikite pirm\u0105j\u0105 medicinos pagalb\u0105.");aid_shock = new StringItem ("\u0160okas", "Kraujotakos sutrikimas d\u0117l nepakankamo deguonies tiekimo \u012F k\u016Bn\u0105.\nPrie\u017Eastis: Skys\u010Di\u0173 praradimas, suma\u017E\u0117j\u0119s kraujo t\u016Bris.\nSimptomai: bly\u0161kumas, \u0161alta oda, \u0161altas prakaitas, nerimas.\n1. Pa\u0161alinkite \u0161oko prie\u017East\u012F (pvz.sustabdykite skys\u010Di\u0173 praradim\u0105, sutvarstykite \u017Eaizd\u0105)!\n2. Paguldykite su\u017Eeist\u0105j\u012F ant paklod\u0117s, pakelkite kojas auk\u0161tyn. Nuraminkit nukent\u0117jus\u012Fj\u012F.\n3. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n4. Jei sunku kv\u0117puoti ar sutrikusi kraujotaka, prad\u0117kite gaivinim\u0105.");aid_skullfracture = new StringItem ("Kaukol\u0117s l\u016B\u017Eis", "Lengvas kraujavimai i\u0161 nosies, burnos arba aus\u0173. Da\u017Enai atviros \u017Eaizdos kaukol\u0117je.\n1. Steb\u0117kite kv\u0117pavimo takus, kad neu\u017Esikim\u0161t\u0173.\n2. Jeigu nukent\u0117j\u0119s s\u0105moningas: Pasodinkite ir lengvai palenkite \u012F priek\u012F. Stenkit\u0117s daugiau nejudinti.!\n3. Jei be s\u0105mon\u0117s: Stabili pozicija ant \u0161ono (nespauskite \u017Eaizdos galvoje).\n4. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n5. Sutvarstykite galv\u0105 tvars\u010Diu.\n6. Jei sunku kv\u0117puoti, sutrikusi kraujotaka, prad\u0117kite gaivinim\u0105.");aid_snakebite = new StringItem ("Gyvat\u0117s \u012Fkandimas", "Smeigtuko dyd\u017Eio durtin\u0117 \u017Eaizda, stiprus skausmas, patinimas, purpurin\u0117 spalva. Kraujotakos sutrikimas, galimas \u0161okas.\n1. \u012Ek\u0105st\u0105 k\u016Bno dal\u012F paguldyti.\n2. D\u0117kite \u0161altus kompresus ant \u012Fkandimo vietos.\n3. Imkit\u0117s veiksm\u0173 prie\u0161 \u0161ok\u0105.\n4. Kvieskite greit\u0105j\u0105 pagalb\u0105.");aid_sos = new StringItem ("SOS - Nelaim\u0117s Signalas", "1. Signalas: 3x trumpai, 3x ilgai, 3x trumpai.\n2. Opti\u0161kai (lempute, pro\u017Eektoriumi) oder akusti\u0161kai (signalini\u0161kai \u0161vilpuku, beldimu).");aid_sprain = new StringItem ("Sausgysl\u0117s patempimas, s\u0105nario i\u0161sukimas", "Skausmas, tinimas (m\u0117lyn\u0117), funcijos nebuvimas, gal\u016Bni\u0173 deformacijos.\n1. Paguldykite nukent\u0117jusiojo gal\u016Bn\u0119 patogiai.\n2. \u0160aldyti (naudokite ledo paketus).\n3. Jei \u012Fmanoma paguldykite gal\u016Bn\u0119 auk\u0161\u010Diau.\n4. Vykite \u012F ligonin\u0119 ar kvieskite greitosios pagalbos gydytoj\u0105.");aid_stroke = new StringItem ("Insultas", "Staigus paraly\u017Eius arba nutirpimas (veido, rankos, kojos), kalbos, regos sutrikimai, sutrikusi s\u0105mon\u0117, stipr\u016Bs galvos skausmai. Kv\u0117pavimo, rijimo problemos, \u0161lapimo p\u016Bsl\u0117s ir \u017Earnyno nevaldymas.\n1. Kvieskite greit\u0105j\u0105 pagalb\u0105!\n2. Atpalaiduokite ver\u017Eian\u010Dius drabu\u017Eius, neduokite medikament\u0173, neduokite gerti.\n3. Nukent\u0117jus\u012Fj\u012F pasodinkite arba paguldykite patogiai. Nusiraminkite!\n4. Steb\u0117kite s\u0105mon\u0119 ir kv\u0117pavim\u0105.\n5. Jeigu problemos su kv\u0117pavimu arba s\u0105mon\u0117s sutrikimai, prad\u0117kite gaivinim\u0105.");aid_suffocation = new StringItem ("U\u017Edusimas", "Nepakankamas apr\u016Bpinimas deguonimi. Trach\u0117ja u\u017Edaryta. Gali sustoti kv\u0117pavimas (apn\u0117ja)\nSimptomai: \u0161vok\u0161\u010Diantis kv\u0117pavimas, kosulys, dusulys, odos spalvos pakitimas.\n1. Veikite skubiai! Leiskite nukent\u0117jusiajam stipriai atsikos\u0117ti.\n2. Stipriai suduokite plok\u0161\u010Dia ranka kelet\u0105 kart\u0173 per nugar\u0105 tarp men\u010Di\u0173 (k\u016Bdik\u012F pasiguldykite sau ant rankos, galv\u0105 laikykite \u017Eemyn).\n3. Jei tai neduoda rezultat\u0173: atsistokite asmeniui i\u0161 nugaros, u\u017Ed\u0117kite rankas ant juosmens, palenkite nukent\u0117jus\u012Fj\u012F lengvai \u012F priek\u012F.\n4. Sugniau\u017Ekite kum\u0161t\u012F nukent\u0117jusiojo skrand\u017Eio lygmenyje ir apkabinkite kita ranka.\n5. Abi apkabinusias rankas traukite staigiu judesiu auk\u0161tyn/link sav\u0119s, lyg nor\u0117tum\u0117te nukent\u0117jus\u012Fj\u012F kilstel\u0117ti.\n6. Kartokite tai iki 5-i\u0173 kart\u0173! Kv\u0117pavimo takai tur\u0117t\u0173 atsilaisvinti, jeigu buvo u\u017Ekim\u0161ti daiktu.\n7. Kvieskite greit\u0105j\u0105 pagalb\u0105.\n8. Jei \u0161i pirmosios pagalbos priemon\u0117 n\u0117ra s\u0117kminga, vistiek t\u0119skite j\u0105 kol atvyks gydytojas");aid_sunburn = new StringItem ("Nudegimas saul\u0117je", "1. Nuveskite nukent\u0117jus\u012Fj\u012F \u012F pav\u0117s\u012F. Venkite saul\u0117 spinduli\u0173.\n2. Duokite gerti daug vandens (d\u0117l dehidratacijos).\n3. Esant sunkiam nudegimui (darosi p\u016Bsl\u0117s, paraudimas, skausmas), nedelsiant kreipkit\u0117s pas gydytoj\u0105.\n4. Jeigu oda tik truput\u012F raudona, \u0161aldykite j\u0105 dr\u0117gnais kompresais. Naudokite krem\u0105 arba gel\u012F skirt\u0105 tepti po deginimosi saul\u0117je.");aid_sunstroke = new StringItem ("Saul\u0117s sm\u016Bgis", "Galva kar\u0161ta ir raudona, oda \u0161alta, \u0161leik\u0161tulys, galvos skausmas, galvos svaigimas. Prie\u017Eastis: Sudirginta smegen\u0173 membrana.\n1. Ie\u0161kokite v\u0117sios vietos, pav\u0117sio. Vir\u0161utin\u0117 k\u016Bno dalis turi b\u016Bti pakelta auk\u0161\u010Diau.\n2. \u0160aldykite galv\u0105 dr\u0117gnais kompresais.\n3. Skambinkite greitajai pagalbai, steb\u0117kite kv\u0117pavim\u0105.\n4. Jei nekent\u0117jus\u012Fsis s\u0105moningas: Duokite gerti \u0161alto g\u0117rimo.\n5. Jeigu sustojo kv\u0117pavimas, prad\u0117kite dirbtin\u012F kv\u0117pavim\u0105.\n6. T\u0119skite dirbtin\u012F kv\u0117pavim\u0105!");aid_unconsciouswithbreath = new StringItem ("S\u0105mon\u0117s netekimas/ nualpimas (nukent\u0117j\u0119s kv\u0117puoja)", "Nukent\u0117j\u0119s nereaguoja \u012F kalbinim\u0105 ar judinim\u0105. Nukent\u0117j\u0119s kv\u0117puoja.\n1. Jei netoliese yra \u017Emoni\u0173, kreipkit\u0117s \u012F juos pagalbos.\n2. Paguldykite nukent\u0117jus\u012Fj\u012F stabiliai ant \u0161ono. Galv\u0105 palenkite \u017Eemyn, pra\u017Eiodinkite burn\u0105, kad vemiant neu\u017Espringt\u0173.\n3. Kvieskite greit\u0105j\u0105 pagalb\u0105.");aid_unconsciouswithoutbreath = new StringItem ("S\u0105mon\u0117s netekimas (nukent\u0117j\u0119s nekv\u0117puoja)", "1. Nukent\u0117j\u0119s nerodo jokios reakcijos, nekv\u0117puoja.\n\n2. Prad\u0117kite gaivinti (dirbtinis kv\u0117pavimas + \u0161irdies masa\u017Eas).");aid_vomiting = new StringItem ("V\u0117mimas", "Pykinimo rezultatas. Pasitu\u0161tina skrandis. Prie\u017Eastys: infekcijos, apsinuodijimai, opos, medikamentai, nekokybi\u0161kas maistas, ne\u0161tumas.\n1. Pavojus d\u0117l dehidratacijos ir mineral\u0173 tr\u016Bkumo!\n2. Duokite gerti skys\u010Di\u0173 (arbatos, vandens).\n3. Sunkiais atvejais, vemiant krauju arba jeigu v\u0117mimas nenustoja, skambinkite gydytojui.");
			aid_amputation = new StringItem ("Amputavimas", "Amputuotos k\u016bno dalys gali b\u016bti prisi\u016btos. Amputuot\u0105 k\u016bno dal\u012f \u0161aldyti, kol atvyks gydytojas.\n1. Nukent\u0117jus\u012fj\u012f nuraminkite, paguldykite ir u\u017eklokite.\n2. Sustabdykite kraujavim\u0105, \u017ei\u016br\u0117ti 'Kraujavimas (stiprus) ir '\u0160okas'.\n3. Amputuot\u0105 k\u016bno dal\u012f suvyniokite \u012f \u0161var\u0173 saus\u0105 rank\u0161luost\u012f ir \u012fd\u0117kite \u012f neper\u0161lampant\u012f plastikin\u012f mai\u0161el\u012f.\n4. Plastikin\u012f mai\u0161el\u012f u\u017eri\u0161kite ir \u012fd\u0117kite \u012f kit\u0105 plastikin\u012f mai\u0161el\u012f pripildyt\u0105 \u0161alto vandens arba ledo.\n5. Neduokite alkoholio, r\u016bkyti ar valgyti (ligonin\u0117je gali prireikti operuoti su narkoze).\n6. Amputuotos k\u016bno dalies ned\u0117kite \u012f \u0161aldikli\u012f (tik \u0161aldykite).\n7. Kvieskite greit\u0105j\u0105 pagalb\u0105 arba va\u017eiuokite \u012f ligonin\u0119.");
			separator = new StringItem ("Separator", "-");  
					// connection between MENU + NRs 
					stringItemArray = new StringItem[] {
							aid_disclaimer, separator, aid_general, aid_chemicalburneyes, aid_eyeinjury, aid_allergic, aid_amputation, aid_poisining, aid_asthma, aid_diabeticcoma, aid_apnoea, aid_asthma, aid_safeguardaccident, aid_epilepsy, aid_resuscitation, aid_dangerzone, aid_birth, aid_emergencycall, aid_snakebite, aid_animalbite, aid_diabeticcoma, aid_hypoglycaemia, aid_stroke, aid_skullfracture, aid_fracture, aid_nosebleeding, aid_bleedinglight, aid_bleedingsevere, aid_resuscitation, aid_apnoea, aid_checkbreathing, aid_safeguardaccident, aid_icerescue, aid_chemicalburn, aid_sunburn, aid_burningslight, aid_burningsevere, aid_backinjury, aid_frostbitemild, aid_frostbitesevere, aid_electricityaccident, aid_hyperthermia, aid_resuscitation, aid_unconsciouswithoutbreath, aid_unconsciouswithbreath, aid_sunstroke, aid_sprain, aid_heartattack, aid_drowning, aid_brainconcussion, aid_shock, aid_sos, aid_recoveryposition, aid_backinjury, aid_hypothermia, aid_suffocation, aid_suffocation, aid_insectstings, aid_vomiting, aid_diarrhoea, separator}; 

			display = Display.getDisplay(this);
			display.setCurrent(this.menu);

			// sets the focus to the given index of the specified list.
			UiAccess.setCurrentListIndex(display, this.menu, 0);

			// set commands and listener to form
			details.addCommand(cmdBack);
			details.setCommandListener(this);

			// application has started
			started = true;
		}
	}


	public void applyText(int auswahl) {						
		// clear form					
		details.deleteAll();					
		// assign title according title of menuItem 					
		details.setTitle(UiAccess.getListItem(menu, menu.getSelectedIndex()).getText());					
		// assign text according to int 'auswahl' 					
		details.append(stringItemArray[auswahl].getText());					
							
		// img:IMAGES					
							
		// spacer					
		details.append(""); 					
							
		// img: CC licence					
		if (auswahl==0) { details.append(imageCC); }					
		// img:apnoea					
		else if (auswahl==29 || auswahl==10) { details.append(aid067);					
						  details.append(""); details.append(aid010);	
						  details.append(""); details.append(aid011); }	
		// img:backinjury					
		else if (auswahl==37 || auswahl==53) { details.append(aid065); }					
		// img:birth					
		else if (auswahl==16) { details.append(aid025);					
							details.append(""); details.append(aid022); 
							details.append(""); details.append(aid023); }
		// img:chemicalburneyes					
		else if (auswahl==3) { details.append(aid019); }					
		// img:bleedinglight					
		else if (auswahl==26) { details.append(aid084);					
							    details.append(""); details.append(aid085); }
		// img:bleedingsevere					
		else if (auswahl==27) { details.append(aid084);					
							    details.append(""); details.append(aid085);
							    details.append(""); details.append(aid089);
							    details.append(""); details.append(aid092); }
		// img:brainconcussion					
		else if (auswahl==49) { details.append(aid061); }					
		// img:dangerzone					
		else if (auswahl==15) { details.append(aid001); }					
		// img:drowning					
		else if (auswahl==48) { details.append(aid034); }					
		// img:electricityaccident					
		else if (auswahl==40) { details.append(aid045); }					
		// img:epilepsy					
		else if (auswahl==13) { details.append(aid058); }					
		// img:fracture					
		else if (auswahl==24) { details.append(aid107); }					
		// img:heartattack					
		else if (auswahl==47) { details.append(aid061); }					
		// img:icerescue					
		else if (auswahl==32) { details.append(aid041); }					
		// img:recoveryposition					
		else if (auswahl==52) { details.append(aid008); 					
							  details.append(""); details.append(aid009); 
							  details.append("\nK\u016Bdikio stabili pozicija ant \u0161ono:"); details.append(aid028); }
		// img:resuscitation					
		else if (auswahl==28 || auswahl==42 || auswahl==14) { 					
							  details.append(aid013);
							  details.append(""); details.append(aid003); 
							  details.append(""); details.append(aid067); 
							  details.append(""); details.append(aid010); 
							  details.append(""); details.append(aid011); 
							  details.append(""); details.append(aid012);
							  details.append("\n\n# K\u016Bdikio Gaivinimas\n\nNaudoti tik du pir\u0161tus:"); details.append(aid029);
							  details.append("\n\u012Ep\u016Bskite ne per stipriai:"); details.append(aid030); }
		// img:safeguardaccident					
		else if (auswahl==31 || auswahl==12) { details.append(aid001); }					
		// img:suffocation					
		else if (auswahl==55 || auswahl==56) { details.append(aid031); 					
							  details.append(""); details.append(aid069); }
		// img:sunstroke					
		else if (auswahl==45) { details.append(aid061); }					
		// img: unconsciouswithbreath					
		else if (auswahl==44) { details.append(aid008); 					
							  details.append(""); details.append(aid009); }
							
		// spacer below					
		details.append("");					
							
		// append Resuscitation measures!					
		// for unconsciouswithoutbreath / drowning / heartattack / brainconcussion / stroke / shock / poisining					
		if (auswahl==43 || auswahl==48 || auswahl==47 || auswahl==49 || auswahl==22 || auswahl==50 || auswahl==7) { 					
			details.append(aid_resuscitation);				
			  details.append(aid013);
			  details.append(""); details.append(aid003);  details.append(""); details.append(aid067); 
			  details.append(""); details.append(aid010);  details.append(""); details.append(aid011); 
			  details.append(""); details.append(aid012);
		}					
		// for electricity / hypothermia					
		else if (auswahl==40 || auswahl==54) { 					
			details.append(aid_unconsciouswithbreath); 				
			details.append("");				
			details.append(aid_unconsciouswithoutbreath); 				
			details.append("");				
			details.append(aid_resuscitation); 				
			  details.append(""); details.append(aid003);   details.append(""); details.append(aid067); 
			  details.append(""); details.append(aid010);   details.append(""); details.append(aid011); 
		} // for sunstroke / asthma / hypoglycaemia					
		else if (auswahl==45 || auswahl==8 || auswahl==21) { 					
			details.append(aid_apnoea);				
			details.append(""); details.append(aid010);	
			details.append(""); details.append(aid011); 
		}
	}						

	public void pauseApp() {
	}

	public void destroyApp(boolean unconditional) {
		notifyDestroyed();
	}

	public void commandAction(Command c, Displayable d) {
		// System.out.println(c.getLabel());
		if(c.getCommandType() == Command.BACK) {
			display.setCurrent(menu);
		}
		else if (c.getCommandType() == Command.EXIT) {
			notifyDestroyed();
		}
		// Country Emergency Menu
		else if (display.getCurrent().getTitle() == telEmergency.getTitle()) {
			details.deleteAll();
			details.setTitle(UiAccess.getListItem(telEmergency, telEmergency.getSelectedIndex()).getText());
			if (telEmergency.getSelectedIndex() == 0) { details.append(stringAfrica); } 
			else if (telEmergency.getSelectedIndex() == 1) { details.append(stringAsia); }
			else if (telEmergency.getSelectedIndex() == 2) { details.append(stringEurope); }
			else if (telEmergency.getSelectedIndex() == 3) { details.append(stringNorthamerica); }
			else if (telEmergency.getSelectedIndex() == 4) { details.append(stringOceania); }
			else if (telEmergency.getSelectedIndex() == 5) { details.append(stringSouthamerica); }
			display.setCurrent(details);
		}
		// Main Menu
		else if (display.getCurrent().getTitle() == menu.getTitle()) {
			if (menu.getSelectedIndex() == 1) { 
				display = Display.getDisplay(this);
				display.setCurrent(telEmergency);
			}
			// catch divider
			else if (menu.getSelectedIndex() == 60) { }
			// notruf
			else if (menu.getSelectedIndex() == 61) {
				try {
					platformRequest("tel:112");
					// platformRequest("http://www.yahoo.com");
					// http://developers.sun.com/mobility/midp/ttips/platformRequest/index.html
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			else {
				// apply text to form and show it
				applyText(menu.getSelectedIndex());
				display = Display.getDisplay(this);
				display.setCurrent(details);
			}
		}
	}
}

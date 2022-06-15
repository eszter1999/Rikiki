Ez a projekt egy egyetemes házi feladatból született.

# A specifikációja:
## Bemutatás
Idén nyáron a baráti társaságommal nagyon megszerettük a Rikiki kártyajátékot. A játékhoz tartozik az, hogy körről körre vezetni kell, hogy ki mennyi kártyát tervezett vinni és ebből mi valósult meg, amihez rendszeresen elfelejtettünk papírt és ceruzát vinni. De mivel telefon mindig volt nálunk, felmerült, hogy jól jönne egy alkalmazás, amin lehetne ezeket vezetni.

## A játék alapja
A játékon belüli körök felépítése a következő: mindenki meg kapja a kör számától függő mennyiségű kártyáját. Ezeket megtekintve egyszerre fogadnak (másképp vállalnak), hogy a saját lapjaik alapján hány hívást fognak vinni. Ezek után az egyik játékos hív egy lapot, amit a többi játékos is követ sorban; a legnagyobb kártyát rakó játékosé a hívás. Egy ilyenre fogadnak a kör elején. A hívások addig folytatódnak, amíg elfogynak a lapok.
Ekkor kell ki számolni, hogy kinek hány pontja van a körben. Minden vitt hívás két pontot ér. Ha teljesítetted a fogadásod, akkor nemcsak a hívásokért kapott pontok a tieid, hanem bónusz tíz pont is, ellenben amennyivel tévedtél annyiszor két pontot vesztesz.
A körök száma általánosan 2x10, tíz körig egytől (ekkor mindenki más kártyáját látod és a sajátodat nem, azt a homlokodhoz tartva fogadsz) egyesével növekedve tízig, majd vissza. A nyertes az, aki a legtöbb pontot kapta a körök alatt. Kivétel ez alól, ha valakinek pontosan 0 pontja van a játék végére.
## Főbb funkciók
A játék a kezdőképernyőjén bemutatja a játékszabályokat általánosan, majd tovább lépve a játékosok megadhatják a nevüket (min 3 ember). Ezek után egyesével be tudják állítani, hogy mi a vállalásuk. Mindenkinek külön képernyő jut, úgyhogy akár körbe is adható a telefon és megmarad az, hogy ne tudják a játékosok egymás tervezett vállalását.
Ha minden játékos megadta a fogadását, amíg lejátszák a játékot az alkalmazás egy kör folyamatban képernyőt mutat, ami közeben megtekinthetőek a vállalások.
A kör végét jelző gomb megnyomása után meg lehet adni, hogy ki mennyit vitt ahhoz képest amit fogadott. Amint mindenki beírta a számait, megjelenik az állás.
Mivel tapasztalat alapján a húsz kör meglehetősen sok, ezért lehetőség van korábban megszakítani a játékot és újat kezdeni, vagy hamarabb elkezdeni csökkenteni a lapokat.
Fontosnak tartom még, hogy ha a hívások megkezdése előtt vagy ha már bekerültek a helyes számok az alkalmazásba, vissza lehessen tölteni az állást.

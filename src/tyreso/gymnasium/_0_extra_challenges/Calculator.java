package tyreso.gymnasium._0_extra_challenges;

/**
 *                          *******************
 *                          ***  CALCULATOR ***
 *                          *******************
 *
 *
 * Den här uppgiften går ut på att bygga en enkel miniräknare till konsollen.
 *
 * Detta är en bra E-uppgift, då du knappt skriver någon logik själv, alla beräkningarna anropar
 * inbyggda Java-funktioner från Java Standard Library.
 *
 * Miniräknaren går bra att skriva i en enda klass, men koden ska vara uppdelad i väl avgränsade metoder.
 *
 * 1. Låt användaren välja plus(+), minus(-), gånger(*), delat med(/) eller upphöjt till(^).
 * 2. Låt användaren sedan mata in två tal.
 * 3. Presentera svaret för användaren i konsollen.
 * 4. Gå tillbaka till steg 1.
 *
 * Tänk på att dokumentera din kod!
 *
 * Bonusfunktioner, implementera några av dessa för D och C-nivå:
 *
 * A: Låt användaren skriva "addition", "multiplikation" med mera istället för att välja en siffra.
 * B: Istället för att anropa den inbyggda ^-funktionen, skriv en metod som använder din multiplikationsmetod för att
 * implementera upphöjt till.
 * C: Lös problemet med integer overflow, antingen genom att varna användaren eller genom att använda en datatyp som
 * kan representera JÄTTESTORA siffror.
 * D: Representera miniräknaren snyggt grafiskt genom att skriva ut en ASCII-miniräknare som visar hela uträkningen.
 * E: Implementera miniräknarfunktionerna även för flyttal(decimaltal)
 * F: Visa även resten(remainder/modulo) vid heltalsdivision.
 * G: Implementera felhantering för användarinput så att programmet meddelar användaren om att dom gett felaktig input
 * och ber dom att försöka igen.
 * H: Implementera multiplikationen som en loop av addition.
 * I(A-bonus, bygger på H): bygg en testklass som kör multiplikation av två siffror via både den
 * inbyggda *-operatorn och via din egen addtionsloop(H-bonusen), kör din simulation 1 000 000 gånger per metod, och
 * jämför tiden det tar. Vilken var snabbast? Leta rätt på en källa som förklarar varför och redogör för ditt resultat.
 *
 * TIPS:
 *
 * -Klassen "Scanner" läser input från konsollen.
 * -printf() skriver ut formaterad text på olika sätt
 * -Menyval implementeras enklast via en while-loop
 * -Att konvertera mellan flyttal och decimaltal är ibland automatiskt, och ibland behövs det att du gör en
 * "cast" eller "typecast", googla dessa termer +"java" för att hitta mer information.
 * -Det finns ett inbyggt sätt att ta tid i Java som du kan använda, men det är ju A-bonus(I), så du får
 * ta reda på hur själv.
 */
public class Calculator {
}

package com.example.tugas_5;

import java.util.ArrayList;

public class NFLData {
    private static String[] appNames = {
            "Arizona Cardinals",
            "Baltimore Ravens",
            "Buffalo Bills",
            "Cleveland Browns",
            "Green Bay Packers",
            "Kansas City Chiefs",
            "New Orleans Saints",
            "Pittsburgh Steelers",
            "Tampa Bay Buccaneers",
            "Tennessee Titans"
    };

    private static String[] appDetails = {
            "The Arizona Cardinals are a professional American football team based in the Phoenix metropolitan area. The Cardinals compete in the National Football League (NFL) as a member club of the National Football Conference (NFC) West division. The team was founded as the Morgan Athletic Club in 1898, and is the oldest continuously run professional football team in the United States. The Cardinals play their home games at State Farm Stadium, which opened in 2006 and is located in the northwestern suburb of Glendale.",
            "The Baltimore Ravens are a professional American football team based in Baltimore. The Ravens compete in the National Football League (NFL) as a member club of the American Football Conference (AFC) North division. The team plays its home games at M&T Bank Stadium and is headquartered in Owings Mills, Maryland.",
            "The Buffalo Bills are a professional American football team based in the Buffalo–Niagara Falls metropolitan area. They compete in the National Football League (NFL) as a member club of the league's American Football Conference (AFC) East division. The team plays its home games at Highmark Stadium in Orchard Park, New York.",
            "The Cleveland Browns are a professional American football team based in Cleveland. Named after original coach and co-founder Paul Brown, they compete in the National Football League (NFL) as a member club of the American Football Conference (AFC) North division. The Browns play their home games at FirstEnergy Stadium,",
            "The Green Bay Packers are a professional American football team based in Green Bay, Wisconsin. The Packers compete in the National Football League (NFL) as a member club of the National Football Conference (NFC) North division. It is the third-oldest franchise in the NFL, dating back to 1919, and is the only non-profit, community-owned major league professional sports team based in the United States. Home games have been played at Lambeau Field since 1957.",
            "The Kansas City Chiefs are a professional American football team based in Kansas City, Missouri. They compete in the National Football League (NFL) as a member club of the league's American Football Conference (AFC) West division. The team plays its home games at Arrowhead Stadium, Kansas City, Missouri ",
            "The New Orleans Saints are a professional American football team based in New Orleans. The Saints compete in the National Football League (NFL) as a member of the league's National Football Conference (NFC) South division. Since 1975, the team plays its home games at Mercedes-Benz Superdome (formerly the Louisiana Superdome) after utilizing Tulane Stadium during its first eight seasons.",
            "The Pittsburgh Steelers are a professional American football team based in Pittsburgh. They compete in the National Football League (NFL) as a member club of the American Football Conference (AFC) North division. the team plays its home games at Heinz Field, Pittsburgh, Pennsylvania ",
            "The Tampa Bay Buccaneers are a professional American football team based in Tampa, Florida. The Buccaneers compete in the National Football League (NFL) as a member club of the league's National Football Conference (NFC) South division. The club joined the NFL in 1976 as an expansion team, along with the Seattle Seahawks, and played its first season in the American Football Conference (AFC) West division. Prior to the 1977 season, Tampa Bay switched conferences and divisions with Seattle, becoming a member of the NFC Central division. During the 2002 league realignment, the Buccaneers joined three former NFC West teams to form the NFC South. The club is owned by the Glazer family and plays its home games at Raymond James Stadium in Tampa.",
            "The Tennessee Titans are a professional American football team based in Nashville, Tennessee. The Titans compete in the National Football League (NFL) as a member club of the American Football Conference (AFC) South division. The team relocated from Houston to Tennessee in 1997, and played at the Liberty Bowl Memorial Stadium in Memphis for one season. The team then moved to Nashville in 1998 and played in Vanderbilt Stadium. For those two years, they were known as the \"Tennessee Oilers\", but changed their name to \"Tennessee Titans\" for the 1999 season. The team currently plays at Nissan Stadium in Nashville, which opened in 1999 as Adelphia Coliseum. The Titans' training facility is at Saint Thomas Sports Park, a 31-acre (13 ha) site at the MetroCenter complex in Nashville.",
    };

    private static String[] appImages = {
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/ARI",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/BAL",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/BUF",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/CLE",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/GB",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/KC",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/NO",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/PIT",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/TB",
            "https://static.www.nfl.com/t_headshot_desktop/f_auto/league/api/clubs/logos/TEN"
    };

    static ArrayList<NFLStore> getListData() {
        ArrayList<NFLStore> list = new ArrayList<>();

        for (int position = 0; position < appNames.length; position++) {
            NFLStore nflStore = new NFLStore();
            nflStore.setsName(appNames[position]);
            nflStore.setsDetail(appDetails[position]);
            nflStore.setsPhoto(appImages[position]);
            list.add(nflStore);
        }
        return list;
    }
}

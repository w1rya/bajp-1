package com.example.bajp1.utils

import com.example.bajp1.data.MovieEntity

object DummyData {

    fun generateMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(
                "mv0", "Welcome to Sudden Death", "68%", "Action, Drama, Thriller",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                "2020", "1h 20m"
        ))

        movies.add(MovieEntity(
                "mv1", "Enola Holmes", "76%", "Crime, Drama, Mystery",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "https://image.tmdb.org/t/p/w1280/riYInlsq2kf1AWoGm80JQW5dLKp.jpg",
                "2020", "2h 3m"
        ))

        movies.add(MovieEntity(
                "mv2", "Mulan", "73%", "Action, Adventure, Drama, Fantasy",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "https://image.tmdb.org/t/p/w1280/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                "2020", "1h 55m"
        ))

        movies.add(MovieEntity(
                "mv3", "Money Plane", "61%", "Action",
                "A professional thief with \$40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "https://image.tmdb.org/t/p/w1280/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                "2020", "1h 22m"
        ))

        movies.add(MovieEntity(
                "mv4", "1917", "79%", "War, Drama, Action, History",
                "At the height of the First World War, two young British soldiers must cross enemy territory and deliver a message that will stop a deadly attack on hundreds of soldiers.",
                "https://image.tmdb.org/t/p/w1280/iZf0KyrE25z1sage4SYFLCCrMi9.jpg",
                "2019", "1h 59m"
        ))

        movies.add(MovieEntity(
                "mv5", "Terminator: Dark Fate", "65%", "Action, Adventure, Science Fiction",
                "Decades after Sarah Connor prevented Judgment Day, a lethal new Terminator is sent to eliminate the future leader of the resistance. In a fight to save mankind, battle-hardened Sarah Connor teams up with an unexpected ally and an enhanced super soldier to stop the deadliest Terminator yet.",
                "https://image.tmdb.org/t/p/w1280/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "2019", "2h 8m"
        ))

        movies.add(MovieEntity(
                "mv6", "John Wick: Chapter 3 - Parabellum", "74%", "Action, Thriller, Crime",
                "Super-assassin John Wick returns with a \$14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
                "https://image.tmdb.org/t/p/w1280/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg",
                "2019", "2h 11m"
        ))

        movies.add(MovieEntity(
                "mv7", "Avengers: Endgame", "83%", "Adventure, Science Fiction, Action",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "https://image.tmdb.org/t/p/w1280/or06FN3Dka5tukK1e9sl16pB3iy.jpg",
                "2019", "3h 1m"
        ))

        movies.add(MovieEntity(
                "mv8", "Spider-Man: Into the Spider-Verse", "84%", "Action, Adventure, Animation, Science Fiction, Comedy",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "https://image.tmdb.org/t/p/w1280/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg",
                "2018", "1h 57m"
        ))

        movies.add(MovieEntity(
                "mv9", "Avengers: Infinity War", "83%", "Adventure, Action, Science Fiction",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "https://image.tmdb.org/t/p/w1280/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "2018", "2h 29m"
        ))

        return movies
    }

    fun generateSeries(): List<MovieEntity> {
        val series = ArrayList<MovieEntity>()

        series.add(MovieEntity(
                "tv0", "Marvel's Daredevil", "79%", "Action, Crime",
                "Lawyer-by-day Matt Murdock uses his heightened senses from being blinded as a young boy to fight crime at night on the streets of Hell’s Kitchen as Daredevil.",
                "https://image.tmdb.org/t/p/w1280/QWbPaDxiB6LW2LjASknzYBvjMj.jpg",
                "2015", "52m"
        ))

        series.add(MovieEntity(
                "tv1", "The Good Doctor", "86%", "Drama",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "https://image.tmdb.org/t/p/w1280/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "2017", "42m"
        ))

        series.add(MovieEntity(
                "tv2","Lucifer", "85%", "Crime, Sci-Fi & Fantasy",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "https://image.tmdb.org/t/p/w1280/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "2016", "45m"
        ))

        series.add(MovieEntity(
                "tv3", "Game of Thrones", "83%", "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "https://image.tmdb.org/t/p/w1280/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "2011", "1h"
        ))

        series.add(MovieEntity(
                "tv4", "The Boys", "85%", "Sci-Fi & Fantasy, Action & Adventure",
                "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                "https://image.tmdb.org/t/p/w1280/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg",
                "2019", "1h"
        ))
        series.add(MovieEntity(
                "tv5", "The Flash", "76%", "Drama, Sci-Fi & Fantasy",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "https://image.tmdb.org/t/p/w1280/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                "2014", "44m"
        ))

        series.add(MovieEntity(
                "tv6", "Money Heist", "83%", "Crime, Drama",
                "To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.",
                "https://image.tmdb.org/t/p/w1280/MoEKaPFHABtA1xKoOteirGaHl1.jpg",
                "2017", "1h 10m"
        ))

        series.add(MovieEntity(
                "tv7", "Stranger Things", "86%", "Mystery, Sci-Fi & Fantasy, Drama",
                "When a young boy vanishes, a small town uncovers a mystery involving secret experiments, terrifying supernatural forces, and one strange little girl.",
                "https://image.tmdb.org/t/p/w1280/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                "2016", "50m"
        ))

        series.add(MovieEntity(
                "tv8", "Marvel's Agents of S.H.I.E.L.D.", "73%","Drama, Sci-Fi & Fantasy, Action & Adventure",
                "Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.",
                "https://image.tmdb.org/t/p/w1280/gHUCCMy1vvj58tzE3dZqeC9SXus.jpg",
                "2013", "43m"
        ))

        series.add(MovieEntity(
                "tv9", "The Mandalorian", "85%", "Sci-Fi & Fantasy, Action & Adventure, Western",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "https://image.tmdb.org/t/p/w1280/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                "2019", "35m"
        ))

        return series
    }
}
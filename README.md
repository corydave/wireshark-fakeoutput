# wireshark-fakeoutput
When making screenshots of WireShark and you just need fake, formatted output

Here's a sample:
================================
```
68  0.5986         192.168.1.13          192.168.1.20           TCP      107   40467 → 25710
69  0.6127         192.168.1.15          192.168.1.20           TCP      152   31798 → 34267
70  0.6860         192.168.1.12          192.168.1.16           TCP      063   53032 → 10713
71  0.7537         192.168.1.13          192.168.1.13           TCP      179   29448 → 21854
72  0.8721         192.168.1.19          192.168.1.11           TCP      103   40733 → 17530
73  0.9590         192.168.1.15          192.168.1.11           TCP      026   25032 → 13691
74  1.0530         192.168.1.15          192.168.1.17           TCP      046   18651 → 22303





Frame 1: 66 on wire (528) bits, 66 bytes captures (528 bits) on interface 0
Ethernet II, Src: Apple_be:46:26(20:c9:d0:aa:33:22), Dst: Azurewav_7d:3a:dc (d0:e7:82:aa:22:23)
Internet Protocol Version 4, Src: 192.168.1.12, Dst: 192.168.1.6
Transmission Control Protocol, Src Port: 53162, Dst Port: 8109, Seq: 1, Ack: 1, Len 66





0000   8b 28 63 21 a1 08 57 37  47 7f 9f 59 65 5c 7d 23    ........  K....:!.
0010   8d ca 7b b4 fd 6b ac f7  c1 d5 20 24 4e 00 61 b6    ...8.@B.  ..=.S9.
0020   09 5c 21 7a a4 84 11 d1  64 40 14 dd 32 03 f9 06    ..k{...:  ..5..X.c
0030   56 d2 6d af 9e 5d f2 b5  8d cf 71 bc 51 f3 6a 4a    ...H..(m  .Bq..e..
0040   22 75 5a f4 7a 12 7b 5b  76 b2 f3 9b 32 65 eb f3    4W...!..  !2......
0050   ef fd 60 dd 18 e6 61 aa  d5 ae d3 cf 71 c7 9d ca    y......1  _.QD...f
0060   df 95 b6 57 93 e7 68 2e  67 70 7b 45 84 ff 29 c0    ....B..w   .97..".
0070   71 30 da df 82 28 92 ec  01 35 e3 a1 93 21 b2 a6    ..t.....  ..C....M
0080   2d fe a4 b1 7b 17 03 00  8e 21 36 c3 14 85 eb b7    :U.|aZ.F  D..m@...
0090   89 32 11 eb 17 a3 32 49  62 d5 30 a2 05 5a ca 35    .......S  .....r.4
```

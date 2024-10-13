import numpy as np
from PIL import Image

inicjaly = Image.open("inicjaly.bmp")
def rysuj_ramke_w_obrazie(obraz, grub):
    tab_obraz = np.asarray(obraz).astype(np.uint8)
    h, w = tab_obraz.shape
    for i in range(h):
        for j in range(grub):
            tab_obraz[i][j]=0
        for j in range(w-grub,w):
            tab_obraz[i][j]=0
    for i in range(w):
        for j in range(grub):
            tab_obraz[j][i]=0
        for j in range(h-grub,h):
            tab_obraz[j][i]=0
    tab = tab_obraz.astype(bool)
    return Image.fromarray(tab)

#rysuj_ramke_w_obrazie(inicjaly,10).show()

def rysuj_ramki(w, h, grub):
    t = (h, w)
    tab = np.zeros(t, dtype=np.uint8)
    i=1
    while(i*grub<h-i*grub):
        if(i%2==0):
            tab[i*grub:h-i*grub, i*grub: w - i*grub]=0
        else:
            tab[i * grub:h - i * grub, i * grub: w - i * grub] = 1
        i+=1
    tab1 = tab.astype(np.bool_)
    return Image.fromarray(tab1)

#rysuj_ramki(100,55,5).show()

def rysuj_pasy_pionowe(w, h, grub):
    t = (h, w)
    tab = np.ones(t, dtype=np.uint8)
    ile =  int(w/grub)
    for k in range(ile):
        for g in range(grub):
            i = k * grub + g
            for j in range(h):
                tab[j, i] = k % 2
    tab = tab * 255
    return Image.fromarray(tab)
#rysuj_pasy_pionowe(200,100,10).show()

def rysuj_wlasne(w, h, grub):
    tab = np.ones((h, w), dtype=np.uint8)
    for i in range(0, h, grub):
        for j in range(0, w, grub):
            if (i // grub) % 2 == (j // grub) % 2:
                tab[i:i + grub, j:j + grub] = 1
            else:
                tab[i:i + grub, j:j + grub] = 0
    tab = tab * 255
    return Image.fromarray(tab)

#rysuj_wlasne(100,100,10).show()

def wstaw_obraz_w_obraz(obraz_bazowy, obraz_wstawiany, m, n):
    tab_bazowy=np.asarray(obraz_bazowy).astype(np.bool_)
    tab_wstawiany=np.asarray(obraz_wstawiany).astype(np.bool_)
    h1, w1 = tab_bazowy.shape
    h2, w2 = tab_wstawiany.shape
    tab = tab_bazowy.copy()
    n_k = min(h1, n + h2)
    m_k = min(w1, m + w2)
    n_p = max(0, n)
    m_p = max(0, m)

    for i in range(n_p, n_k):
        for j in range(m_p, m_k):
            if h2 > i - n >= 0 and w2 > j - m >=0:
                tab[i, j] = tab_wstawiany[i - n, j - m]
    return Image.fromarray(tab)

#wstaw_obraz_w_obraz(rysuj_pasy_pionowe(300,200,15),inicjaly,250,100).show()
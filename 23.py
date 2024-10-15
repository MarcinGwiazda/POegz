import aiohttp
import asyncio

async def fetch_page(url: str) -> str:
    async with aiohttp.ClientSession() as session:
        async with session.get(url) as response:
            return await response.text()

async def main() -> None:
    urls = [
        "https://youtube.com",
        "https://google.pl",
        "https://google.com",
        "https://facebook.com",
        "https://x.com"
    ]

    pages = await asyncio.gather(*[fetch_page(url) for url in urls])

    # Wyświetlenie długości zawartości każdej strony
    i=0
    for page in pages:
        print(f"Strona({urls[i]}): {len(page)} znaków")
        i+=1

if __name__ == "__main__":
    asyncio.run(main())

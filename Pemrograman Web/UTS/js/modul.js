document.addEventListener('DOMContentLoaded', () => {
    const content = document.querySelector('.modul-content');
    const sidebarToc = document.getElementById('toc-list');
    const headings = content.querySelectorAll('h2, h3');
    const sectionOffsets = [];

    headings.forEach((heading, index) => {
        const id = heading.textContent.toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/^-*|-*$/g, '');
        heading.id = id;
        
        const listItem = document.createElement('li');
        const link = document.createElement('a');
        link.href = `#${id}`;
        link.textContent = heading.textContent;
        link.classList.add(`toc-level-${heading.tagName.toLowerCase()}`);

        link.addEventListener('click', () => {
            const targetElement = document.getElementById(id);
            if (targetElement) {
                
                window.scrollTo({
                    top: targetElement.offsetTop - 100,
                    behavior: 'smooth'
                });
            }
        });
        listItem.appendChild(link);
        sidebarToc.appendChild(listItem);
        
        sectionOffsets.push({
            id: id,
            offsetTop: heading.offsetTop
        });
    });

    const activateTocLink = () => {
        let currentActive = null;
        const scrollPosition = window.scrollY + 120; 

        for (let i = sectionOffsets.length - 1; i >= 0; i--) {
            if (scrollPosition >= sectionOffsets[i].offsetTop) {
                currentActive = sectionOffsets[i].id;
                break;
            }
        }

        sidebarToc.querySelectorAll('a').forEach(link => {
            link.classList.remove('active');
        });

        if (currentActive) {
            const activeLink = sidebarToc.querySelector(`a[href="#${currentActive}"]`);
            if (activeLink) {
                activeLink.classList.add('active');
            }
        }
    };

    window.addEventListener('scroll', activateTocLink);
    window.addEventListener('resize', activateTocLink);
    activateTocLink();

    const nextModulLink = document.querySelector('.next-modul-link');
});
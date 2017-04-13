# Docker Workshop

Check out the [Presentation Slides](https://docs.google.com/presentation/d/1e6GlsTyEWnZYNUeiqWseL1Fm7khg0unBnfOa3UWPxt8/present?slide=id.gc6f9e470d_0_0)

And the [Git Repository](https://github.com/MassTroy/docker-workshop)

## Installing Docker on a Mac

[https://docs.docker.com/docker-for-mac/install/](https://docs.docker.com/docker-for-mac/install/)

[tl;dr]
1. Download https://download.docker.com/mac/stable/Docker.dmg
2. Run installer by clicking .dmg
3. From applications menu, run docker
4. Open a terminal and type `docker ps` and make sure you don't get an error message

## Installing Docker on Fedora

[https://docs.docker.com/engine/installation/linux/fedora/](https://docs.docker.com/engine/installation/linux/fedora/)

[tl;dr]
```sudo dnf remove docker docker-common container-selinux docker-selinux docker-engine
sudo dnf -y install dnf-plugins-core
sudo dnf config-manager --add-repo https://download.docker.com/linux/fedora/docker-ce.repo
sudo dnf config-manager --enable docker-ce-edge
sudo dnf makecache fast
sudo dnf install docker-ce

sudo usermod -a -G docker `whoami````

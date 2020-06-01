echo "Installer tested only on linux machines"
echo "Installing GEM"
mkdir ~/GEM
cp -r * ~/GEM
sudo cp -r command/GEM /usr/bin
sudo chmod +x /usr/bin/GEM
sudo cp -r command/GEMc /usr/bin
sudo chmod +x /usr/bin/GEMc
echo "If no error messages printed : Installation completed"

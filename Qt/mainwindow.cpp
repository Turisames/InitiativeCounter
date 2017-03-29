#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "entriesandbutton.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    ui->kirjoitusRuutu->addWidget(new EntriesAndButton{this } );
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::addCombatant(QString Name, unsigned int Init)
{
    combatant tmp;
    tmp.name = Name;    tmp.initiative = Init;

    QLinkedList<combatant>::iterator iter = model_.begin();


    /*
     * The list stays sorted, as the proper place of a combatant
     * is determined as it is added.
    */
    while( (*iter).initiative > Init )
    {
        model_.insert( iter, tmp );
    }
}

void MainWindow::clear()
{
    /*
     * I could have it free the memory as well, but it is better to not do so:
     *
     * If this app is used for several consecutive encounters, as is quite likely,
     * one would pointlessly be freeing and reallocating memory.
     *
     * Besides, it's just a small text and an unsigned integer. They won't take up
     * much space just laying there.
    */
    model_.clear();
}

void MainWindow::sort()
{

}
